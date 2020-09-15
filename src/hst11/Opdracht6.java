package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int h = 50;
        int w = 50;
        int arcangle = 360;
        int arcstart = 0;
        int aantal = 0;

        while (aantal < 5) {
            aantal++;
            h -= 10;
            w -= 10;
            x += 10;
            y += 10;
            g.drawArc(x,y,w,h,arcstart,arcangle);
        }
    }
}
