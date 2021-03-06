package views;

import javax.swing.*;
import java.awt.*;


public class CellRender extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof JLabel) {
            this.setText(((JLabel) value).getText());
            this.setIcon(((JLabel) value).getIcon());
        }
        return this;
    }
}
