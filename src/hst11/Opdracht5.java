package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void paint(Graphics g) {
        int aantal = 0;
        int x = 10;
        int y = 10;
        int w = 40;
        int h = 40;

        while (aantal < 5) {
            aantal++;
            x += 40;
            y += 40;
            g.drawRect(x,y,w,h);
        }
    }
}
