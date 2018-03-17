import javax.swing.*;
import java.awt.*;

/**
 * Main panel class for the application
 */
public class OADPanel extends JPanel {

    private JTabbedPane tabbedPane;

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

    }

    /**
     * Lays-out all the components
     */
    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
    }
}
