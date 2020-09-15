package hst11;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void paint(Graphics g) {
        int getal = 0;
        int x = 10;
        int tafel;

        while (getal < 10) {
            x += 15;
            getal++;
            tafel = 3 * getal;
            g.drawString("" + tafel,x,10);
        }
    }
}
