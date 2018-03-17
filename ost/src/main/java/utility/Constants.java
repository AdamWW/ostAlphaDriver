package utility;

import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Constants {
    public static final ImageIcon OST_ICON = new ImageIcon(Constants.class.getClassLoader().getResource("images/icon.png"));

    public static MessageDigest generateMessageDigest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256");
    }

}
