package com.techchat.integration;

import java.awt.Dimension;
import com.techchat.space.DisplayArea;
import com.techchat.log.LogFileWriter;

import javax.swing.*;

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
