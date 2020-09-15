package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    //decleratie

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 10;
            g.drawLine(x,10,x,50);
        }
    }
}
