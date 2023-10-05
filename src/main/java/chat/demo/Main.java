package chat.demo;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientUI();
                new Server();
            }
        });
    }
}

