package GUIs;

import javax.swing.*;

/*
    Creating an abstract class helps us set up the blueprint that our GUIs will follow. For example, in each of the
    GUIs, they will be the same size and will need to invoke their own addGuiComponents() which will be unique to
    each subclass
 */
public abstract class BaseFrame extends JFrame {
    public BaseFrame(String title) {
        initialize(title);
    }

    private void initialize(String title) {
        // Instantiate iframe properties and add a title to the bar
        setTitle(title);

        // Set size in pixels
        setSize(420,600);

        // Close program when GUI is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*
        Set layout to null to have absolute layout which allows us to manually specify the sie and position
        of each GUI component
         */
        setLayout(null);

        //Prevent GUI from being resizeable
        setResizable(false);

        // Launch the GUI in the center of the screen
        setLocationRelativeTo(null);

        addGuiComponents();
    }

    protected abstract void addGuiComponents();
}
