package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void paint(Graphics g) {
        int x = 70;
        int y = 70;
        int h = 120;
        int w = 120;
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
