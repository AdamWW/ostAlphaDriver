package utility;

import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility class for organizing project-wide constants
 */
public class Constants {

    /* Icon to use in the application */
    public static final ImageIcon OST_ICON =
            new ImageIcon(Constants.class.getClassLoader().getResource("images/icon.png"));

    private static MessageDigest messageDigest;

    /**
     * Generates the message digest
     *
     * @return the message digest
     * @throws NoSuchAlgorithmException if the algorithm supplied to the message digest is not recognized
     */
    public static MessageDigest generateMessageDigest() throws NoSuchAlgorithmException {
        if (messageDigest == null) {
            messageDigest = MessageDigest.getInstance("SHA-256");
        }
        return messageDigest;
    }

}
