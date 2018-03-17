import javax.swing.*;

public class UserPage extends JPanel {
    private JPanel page;
    private JRadioButton singleUserRadioButton;
    private JRadioButton bulkUserradioButton;
    private ButtonGroup buttonGroup;

    public UserPage() {

        initComponents();
    }

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

}
