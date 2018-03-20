package pages.userPanels;

import javax.swing.*;

/**
 * Users panel for creating a single user
 */
public class SingleUserPanel extends JPanel {

    private JTextField nameField;


    /**
     * Default constructor
     */
    public SingleUserPanel(){
        super();
        setBorder(BorderFactory.createTitledBorder("Create a user"));
    }

}
