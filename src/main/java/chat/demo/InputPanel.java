package chat.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {

    private JTextField inputField;
    private JButton sendButton;

    public InputPanel() {

        inputField = new JTextField(25);
        sendButton = new JButton("Send");

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText();
                Server.receiveMessage(message);
                inputField.setText("");
            }
        });

        setLayout(new BorderLayout());
        add(inputField, BorderLayout.WEST);
        add(sendButton, BorderLayout.EAST);
    
    }
}
