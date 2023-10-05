package chat.demo;

import java.awt.Dimension;

import javax.swing.*;

public class Server extends JFrame {

    private static DisplayArea displayArea;

    protected Server() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat server");

        displayArea = new DisplayArea();
        add(new JScrollPane(displayArea));

        displayArea.loadMessagesFromFile("log.txt");

        displayArea.setPreferredSize(new Dimension(400, 400));

        pack();
        setVisible(true);
    }

    protected static void receiveMessage(String message) {
        displayArea.appendMessage(message);
        LogFileWriter.saveToLogFile(message, "log.txt");
    }
}
