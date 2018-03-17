package pages;

import pages.userPanels.BulkUserPanel;
import pages.userPanels.SingleUserPanel;
import utility.SettablePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Page class for the user creation actions
 */
public class UserPage extends JPanel {

    private JRadioButton singleUserRadioButton;
    private JRadioButton bulkUserRadioButton;
    private SingleUserPanel singleUserPanel;
    private BulkUserPanel bulkUserPanel;
    private SettablePanel settablePanel;

    public UserPage() {
        super(new BorderLayout());
        initComponents();
        layoutComponents();
    }

    /**
     * Initializes the components
     */
    private void initComponents() {
        singleUserRadioButton = new JRadioButton("Create a single user");
        bulkUserRadioButton = new JRadioButton("Create multiple users");
        ButtonGroup buttonGroup = new ButtonGroup();

        settablePanel = new SettablePanel();
        singleUserPanel = new SingleUserPanel();
        bulkUserPanel = new BulkUserPanel();

        singleUserRadioButton.addActionListener(e -> {
            settablePanel.set(singleUserPanel);
        });

        bulkUserRadioButton.addActionListener(e -> {
            settablePanel.set(bulkUserPanel);
        });

        buttonGroup.add(singleUserRadioButton);
        buttonGroup.add(bulkUserRadioButton);
        singleUserRadioButton.setSelected(true);
    }

    /**
     * Lays-out all the components
     */
    private void layoutComponents() {
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();

        topPanel.add(singleUserRadioButton);
        topPanel.add(bulkUserRadioButton);

        add(topPanel, BorderLayout.PAGE_START);
        add(settablePanel, BorderLayout.CENTER);

        settablePanel.set(singleUserPanel);
    }

}
