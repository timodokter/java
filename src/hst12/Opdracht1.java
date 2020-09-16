package hst12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    //decleratie
    double[] gemiddelde;
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;
    double j;
    double uitkomst;

    public void init() {
        a = 6.5;
        b = 6;
        c = 3;
        d = 4.3;
        e = 8.1;
        f = 10;
        g = 2.5;
        h = 6.7;
        i = 7;
        j = 9.9;
        uitkomst = (a+b+c+d+e+f+g+h+i+j) / 10;
        gemiddelde = new double[11];
        gemiddelde[0] = a;
        gemiddelde[1] = b;
        gemiddelde[2] = c;
        gemiddelde[3] = d;
        gemiddelde[4] = e;
        gemiddelde[5] = f;
        gemiddelde[6] = g;
        gemiddelde[7] = h;
        gemiddelde[8] = i;
        gemiddelde[9] = j;
        gemiddelde[10] = uitkomst;

        for (int teller = 0; teller < gemiddelde.length; teller++) {
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < gemiddelde.length; teller++) {
            g.drawString("" + gemiddelde[teller], 90,20 * teller + 20);
        }
        g.drawString("gemiddelde: ", 20,220 );
    }
}
