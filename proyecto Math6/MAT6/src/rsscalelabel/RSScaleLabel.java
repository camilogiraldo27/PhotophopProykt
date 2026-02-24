package rsscalelabel;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RSScaleLabel {

    public static void setScaleLabel(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        if (icon.getIconWidth() <= 0 || icon.getIconHeight() <= 0) {
            System.err.println("RSScaleLabel: could not load image from path: " + imagePath);
            label.setIcon(null);
            return;
        }
        int width = label.getWidth() > 0 ? label.getWidth() : icon.getIconWidth();
        int height = label.getHeight() > 0 ? label.getHeight() : icon.getIconHeight();
        Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaled));
    }
}
