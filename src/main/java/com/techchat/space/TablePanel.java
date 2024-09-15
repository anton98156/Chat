package com.techchat.space;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablePanel extends JPanel {
    public TablePanel() {
        Object[][] data = {{"127.0.0.1", "8189"}, {"Login: ", "******"}};
        Object[] columnNames = {"IP Address: ", "Port / Password: "};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JButton loginButton = new JButton("Login");

        JTable table = new JTable(tableModel);
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);
        table.setEnabled(false);
        setLayout(new BorderLayout());

        add(loginButton, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
