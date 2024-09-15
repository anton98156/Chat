package com.chatlounge;

import javax.swing.SwingUtilities;

import com.chatlounge.integration.*;;

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

