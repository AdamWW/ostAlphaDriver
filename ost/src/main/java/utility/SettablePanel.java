package utility;

import com.google.common.base.Preconditions;

import javax.swing.*;
import java.awt.*;

/**
 * Panel used to switch components within a single container
 */
public class SettablePanel extends JPanel {

    /**
     * Default constructor
     */
    public SettablePanel() {
        super(new BorderLayout());
    }

    /**
     * Swaps any existing component with what's provided
     *
     * @param comp the new component to set in this panel
     */
    public void set(Component comp) {
        Preconditions.checkNotNull(comp);
        removeAll();
        add(comp, BorderLayout.CENTER);
        invalidate();
        revalidate();
        repaint();
    }
}
