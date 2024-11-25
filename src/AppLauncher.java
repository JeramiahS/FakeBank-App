import GUIs.LoginGUI;
import GUIs.RegisterGUI;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new LoginGUI().setVisible(true);
                new RegisterGUI().setVisible(true);
            }
        });
    }
}

