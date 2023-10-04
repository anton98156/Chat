package chat.demo;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Server extends JFrame {

    private static JTextArea displayArea;

    protected Server() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat server");

        displayArea = new JTextArea(20, 30);
        displayArea.setEditable(false);

        add(new JScrollPane(displayArea));

        try (BufferedReader reader = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                displayArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        pack();
        setVisible(true);
    }

    protected static void receiveMessage(String message) {
        displayArea.append(message + "\n");
        saveToLogFile(message);
    }

    private static void saveToLogFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
