import utility.Constants;

import javax.swing.*;
import java.awt.*;

/**
 * Main class for the UI - OST α driver!
 */
public class OADClient extends JFrame {

    /**
     * Default constructor
     */
    public OADClient() {
        super("OST ALPHA DRIVER APP");
        setIconImage(Constants.OST_ICON.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new OADPanel());
    }

    /**
     * Main method to launch the UI
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        JPanel panel = new JPanel(new BorderLayout(5,5));
        JPanel upperPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        JPanel lowerPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        JLabel apiLabel = new JLabel("Enter your API key:");
        JLabel secretLabel = new JLabel("Enter your API secret:");
        JTextField apiField = new JTextField();
        apiField.setPreferredSize(new Dimension(300, 18));
        JTextField secretField = new JTextField();
        secretField.setPreferredSize(new Dimension(300, 18));

        upperPanel.add(apiLabel);
        upperPanel.add(apiField);

        lowerPanel.add(secretLabel);
        lowerPanel.add(secretField);

        panel.add(upperPanel, BorderLayout.PAGE_START);
        panel.add(lowerPanel, BorderLayout.PAGE_END);

        int response;
        boolean empty;

        do {
            response = JOptionPane
                    .showOptionDialog(null, panel, "Please enter your ostKit α API key & secret (found in the kit web app)",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, Constants.OST_ICON, null, null);

            empty = ((apiField.getText().isEmpty()) && (secretField.getText().isEmpty())) && (response == JOptionPane.OK_OPTION);

            if (empty) {
                JOptionPane.showMessageDialog(null,
                        "API key or secret is less than the minimum recognized length. Please try again.", "API Key / Secret Error",
                        JOptionPane.ERROR_MESSAGE, null);
            }
        } while (empty);

        if (response == JOptionPane.OK_OPTION) {
            JFrame ostDriverFrame = new OADClient();

            ostDriverFrame.setLocationRelativeTo(null);
            ostDriverFrame.pack();
            ostDriverFrame.setVisible(true);
        }
    }

}
