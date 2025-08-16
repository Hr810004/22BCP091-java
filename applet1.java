import java.applet.Applet;
import java.awt.Graphics;

public class PaintingApplet extends Applet {

    public void paint(Graphics g) {
        // Draw text
        g.drawString("Hello, Painting!", 50, 200);
    }
}
