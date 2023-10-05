package chat.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class LogFileWriter {
    public static void saveToLogFile(String message, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}