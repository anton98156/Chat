package chat.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextArea;

class DisplayArea extends JTextArea {
    
    public DisplayArea() {
        setEditable(false);
    }

    public void loadMessagesFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                appendMessage(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendMessage(String message) {
        append(message + "\n");
    }
}