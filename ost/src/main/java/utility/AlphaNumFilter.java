package utility;

import org.apache.commons.lang3.StringUtils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class AlphaNumFilter extends DocumentFilter {

    @Override public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        if(test(string)){
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {
        if(test(text)){
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean test(String s) {
        return StringUtils.isAlphanumeric(s);
    }
}
