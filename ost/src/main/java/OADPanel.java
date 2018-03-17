import pages.UserPage;

import javax.swing.*;
import java.awt.*;

/**
 * Main panel class for the application
 */
public class OADPanel extends JPanel {

    private JTabbedPane tabbedPane;
    private UserPage userPage;

    /**
     * Default constructor
     */
    public OADPanel() {
        initComponents();
        layoutComponents();
    }

    /**
     * Initializes the components
     */
    private void initComponents() {
        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        userPage = new UserPage();

        tabbedPane.addTab("Users", userPage);
    }

    /**
     * Lays-out all the components
     */
    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
    }
}
