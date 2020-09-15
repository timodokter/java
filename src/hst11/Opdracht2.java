package hst11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int x = 10;

        for(teller = 11; teller <= 20; teller++) {
            x += 10;
            g.drawString("" + teller,50,teller*10);
        }
    }
}
