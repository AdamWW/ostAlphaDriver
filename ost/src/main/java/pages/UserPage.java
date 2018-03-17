package pages;

import javax.swing.*;

/**
 * Page class for the user creation actions
 */
public class UserPage extends JPanel {

    private JPanel page;
    private JRadioButton singleUserRadioButton;
    private JRadioButton bulkUserradioButton;
    private ButtonGroup buttonGroup;

    public UserPage() {
        initComponents();
        layoutComponents();
    }

    /**
     * Initializes the components
     */
    private void initComponents() {
        page = new JPanel();
        singleUserRadioButton = new JRadioButton("Create a single user");
        bulkUserradioButton = new JRadioButton("Create multiple users");
        buttonGroup = new ButtonGroup();

        buttonGroup.add(singleUserRadioButton);
        buttonGroup.add(bulkUserradioButton);
        singleUserRadioButton.setSelected(true);

        page.setBorder(BorderFactory.createTitledBorder(""));

        singleUserRadioButton.addActionListener(e -> {

        });
    }

    /**
     * Lays-out all the components
     */
    private void layoutComponents() {

    }

}
