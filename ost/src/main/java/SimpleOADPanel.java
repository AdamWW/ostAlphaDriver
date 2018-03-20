import utility.AlphaNumFilter;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;

/**
 * Main (simple) panel class for the application
 */
public class SimpleOADPanel extends JPanel {
    private JTextField nameField;
    private JSpinner multiNameSpinner;
    private SpinnerNumberModel multiNameModel;
    private JPanel createTransactionPanel;
    private JPanel runTransactionPanel;
    private JComboBox<String> transactionComboBox;
    private JComboBox<String> userChooser1;
    private JComboBox<String> userChooser2;

    private JLabel nameLabel;
    private JButton createTransButton;
    private JButton multiNameButton;
    private JButton nameButton;
    private JButton runbutton;

    private GridBagConstraints gbc;

    /**
     * Default constructor
     */
    public SimpleOADPanel() {
        super(new GridBagLayout());

        initComponents();
        layoutComponents();
        initListeners();
    }
    /**
     * Initializes the components
     */
    private void initComponents() {
        nameField = new JTextField();
        ((PlainDocument)nameField.getDocument()).setDocumentFilter(new AlphaNumFilter());
        multiNameModel = new SpinnerNumberModel(1, 1, 1000, 1);
        multiNameSpinner = new JSpinner(multiNameModel);
        createTransactionPanel = new JPanel();
        runTransactionPanel = new JPanel();
        transactionComboBox = new JComboBox<>();
        userChooser1 = new JComboBox<>();
        userChooser2 = new JComboBox<>();

        nameLabel = new JLabel("Enter name for new user:");
        createTransButton = new JButton("Create Transaction");
        nameButton = new JButton("Create");
        multiNameButton = new JButton("Create multiple users");
        runbutton = new JButton("Run Transactions");
    }

    /**
     * Lays-out all the components
     */
    private void layoutComponents() {
        gbc = new GridBagConstraints();
        setBorder(BorderFactory.createTitledBorder("Alpha Driver"));

        add(nameLabel, gbc);
        gbc.gridy++;
        add(nameField, gbc);
        gbc.gridy++;
        add(nameButton, gbc);
        gbc.gridy = 0;
        gbc.gridx++;

        add(multiNameButton, gbc);
        gbc.gridx++;
        add(createTransButton, gbc);
        gbc.gridx++;
        add(runbutton, gbc);


    }

    /**
     * Initializes all listeners
     */
    private void initListeners() {
        nameButton.addActionListener(e -> {
            String name = nameField.getText();
            if(name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name cannot be blank");
            } else {

            }
        });
    }
}
