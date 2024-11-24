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

        // Set location and size of the GUI component
        fakeBankAppLabel.setBounds(0,20,super.getWidth(),40);

        // Change font style
        fakeBankAppLabel.setFont(new Font("Dialog",Font.BOLD,32));

        // Center text in JLabel
        fakeBankAppLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add to GUI
        add(fakeBankAppLabel);
    }
}
