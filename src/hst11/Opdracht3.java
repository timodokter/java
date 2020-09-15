package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void paint(Graphics g) {
        int getal = 1;
        int getal2= 1;
        int x = 10;

        while (getal < 100) {
            x += 40;
            g.drawString("" + getal + " " + getal2,x,10);
            getal += getal2;
            getal2 += getal;
        }
    }
}
