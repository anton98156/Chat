package com.chatlounge.integration;

import java.awt.Dimension;

import javax.swing.*;

import com.chatlounge.log.LogFileWriter;
import com.chatlounge.space.DisplayArea;

public class Server extends JFrame {

    private static DisplayArea displayArea;

    public Server() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat server");

        displayArea = new DisplayArea();
        add(new JScrollPane(displayArea));

        displayArea.loadMessagesFromFile("log.txt");

        displayArea.setPreferredSize(new Dimension(400, 400));

        pack();
        setVisible(true);
    }

    public static void receiveMessage(String message) {
        displayArea.appendMessage(message);
        LogFileWriter.saveToLogFile(message, "log.txt");
    }
}
