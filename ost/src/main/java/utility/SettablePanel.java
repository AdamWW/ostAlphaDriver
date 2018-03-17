package utility;

import com.google.common.base.Preconditions;

import javax.swing.*;
import java.awt.*;

public class SettablePanel extends JPanel {

    public SettablePanel() {
        super(new BorderLayout());
    }
    public void swap(Component comp) {
        Preconditions.checkNotNull(comp);
        removeAll();
        add(comp, BorderLayout.CENTER);
    }
}
