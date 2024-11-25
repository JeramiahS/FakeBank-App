package GUIs;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends BaseFrame {
    public LoginGUI() {
        super("FakeBank App Login");
    }

    @Override
    protected void addGuiComponents() {
        // Create app label
        JLabel fakeBankAppLabel = new JLabel("FakeBank App");
        fakeBankAppLabel.setBounds(0, 20, super.getWidth(), 40);
        fakeBankAppLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        fakeBankAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fakeBankAppLabel.setForeground(Color.WHITE);
        add(fakeBankAppLabel);

        // Create username label
        JLabel userNameLabel = new JLabel("Username:");
        userNameLabel.setBounds(20, 120, getWidth() - 30, 24);
        userNameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        userNameLabel.setForeground(Color.WHITE);
        add(userNameLabel);

        // Create username field
        JTextField userNameField = new JTextField();
        userNameField.setBounds(20, 160 , getWidth() - 50, 40 );
        userNameField.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(userNameField);

        // Create password label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 280, getWidth() - 50, 24);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        passwordLabel.setForeground(Color.WHITE);
        add(passwordLabel);

        // Create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 320, getWidth() - 50, 40);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordField);

        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(20, 460, getWidth() - 50, 40);
        loginButton.setFont(new Font("Dialog", Font.BOLD, 20));
        add(loginButton);

        // Create register label
        JLabel registerLabel = new JLabel("<html><a href=\"#\">Don't have an account? Register here</a></html>");
        registerLabel.setBounds(0, 510, getWidth() - 10, 30);
        registerLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);
    }
}
