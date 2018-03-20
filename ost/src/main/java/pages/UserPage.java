package pages;

import pages.userPanels.BulkUserPanel;
import pages.userPanels.ListUsersPanel;
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
    private JRadioButton listUsersRadioButton;
    private SingleUserPanel singleUserPanel;
    private BulkUserPanel bulkUserPanel;
    private ListUsersPanel listUsersPanel;
    private SettablePanel settablePanel;

    /**
     * Default constructor
     */
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
        listUsersRadioButton = new JRadioButton("List users");
        ButtonGroup buttonGroup = new ButtonGroup();

        settablePanel = new SettablePanel();
        singleUserPanel = new SingleUserPanel();
        bulkUserPanel = new BulkUserPanel();
        listUsersPanel = new ListUsersPanel();

        singleUserRadioButton.addActionListener(e -> settablePanel.set(singleUserPanel));
        bulkUserRadioButton.addActionListener(e -> settablePanel.set(bulkUserPanel));
        listUsersRadioButton.addActionListener(e -> settablePanel.set(listUsersPanel));

        buttonGroup.add(singleUserRadioButton);
        buttonGroup.add(bulkUserRadioButton);
        buttonGroup.add(listUsersRadioButton);
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
        topPanel.add(listUsersRadioButton);

        add(topPanel, BorderLayout.PAGE_START);
        add(settablePanel, BorderLayout.CENTER);

        settablePanel.set(singleUserPanel);
    }

}
