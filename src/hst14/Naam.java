package hst14;

import java.applet.Applet;
import java.awt.*;

public class Naam extends Applet {
    //decleratie
    String naam = "Timo";
    int y = 20;
    int maximaalaantalnamen = 10;
    int aantalnamen = 0;

    public void paint(Graphics g) {
        y = 20;
        for (aantalnamen = 0; aantalnamen <= maximaalaantalnamen; aantalnamen++) {
            g.drawString("" + naam, 20, y);
            y += 20;
            System.out.println(naam);
        }
    }
}
