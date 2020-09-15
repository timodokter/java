package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void paint(Graphics g) {
        int x = 10;
        int y = 10;
        int h = 1000;
        int w = 1000;
        int arcangle = 360;
        int arcstart = 0;
        int aantal = 0;

        while (aantal < 50) {
            aantal++;
            h -= 20;
            w -= 20;
            x += 10;
            y += 10;
            g.drawArc(x,y,w,h,arcstart,arcangle);
        }
    }
}
