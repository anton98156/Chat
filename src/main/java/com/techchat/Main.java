package com.techchat;

import javax.swing.SwingUtilities;
import com.techchat.integration.*;;

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

