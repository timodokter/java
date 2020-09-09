package hst6;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet{
    //declearatie
    Color achtergrondkleur;
    Color tekstkleur;
    int uitkomst;
    int a;
    int b;

    public void init() {
        //initialisatie
        achtergrondkleur = Color.blue;
        tekstkleur = Color.black;
        a = 2147483647;
        b= 5;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        setBackground(achtergrondkleur);
        g.setColor(tekstkleur);

    }
}
