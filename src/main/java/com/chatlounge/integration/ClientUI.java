package com.chatlounge.integration;

import javax.swing.*;

import com.chatlounge.space.InputPanel;
import com.chatlounge.space.TablePanel;

import java.awt.*;

public class ClientUI extends JFrame {
    private TablePanel tablePanel;
    private InputPanel inputPanel;

    public ClientUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat client");

        tablePanel = new TablePanel();
        inputPanel = new InputPanel();

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(tablePanel, BorderLayout.NORTH);
        contentPane.add(inputPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }
}
