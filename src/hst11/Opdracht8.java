package hst11;

import java.applet.Applet;
import java.awt.*;

    public class Opdracht8 extends Applet {

        public void paint(Graphics g) {
            int x = 50;
            int y = 50;
            int h = 100;
            int w = 100;
            int arcangle = 360;
            int arcstart = 0;
            int aantal = 0;

            while (aantal < 100) {
                aantal++;
                h += 1;
                w += 1;
                g.drawArc(x,y,w,h,arcstart,arcangle);
            }
        }
    }
