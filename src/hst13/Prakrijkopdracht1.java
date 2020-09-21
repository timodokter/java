package hst13;

import java.applet.Applet;
import java.awt.*;

public class Prakrijkopdracht1 extends Applet {

    public void paint(Graphics g) {
        tekenboom(g, 50,50,200,500);
    }

    void tekenboom(Graphics g, int x, int y, int w, int h) {
        if (h < w*1.6) {
            h = w/10*16;
        }

        //de stam
        g.setColor(new Color(110,44,31));
        g.fillRect(x + (w / 5 * 2), y + (w / 10 * 9), w / 5, h - (w / 10 * 9));

        //de bladeren
        g.setColor(new Color(50,205,76));
        g.fillOval(x,y,w,w);
    }
}
