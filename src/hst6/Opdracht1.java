package hst6;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{
    //decleratie
    Color achtergrondkleur;
    Color tekstkleur;
    int uitkomstJan;
    double uitkomstAli;
    double uitkomstJeanette;
    double uitkomstTimo;
    double aantalmensen;
    double bedrag;

    public void init() {
        //initialisatie
        achtergrondkleur = Color.black;
        tekstkleur = Color.WHITE;
        bedrag = 113;
        aantalmensen = 4;
        uitkomstAli = bedrag / aantalmensen;
        uitkomstJan = (int) (bedrag / aantalmensen);
        uitkomstJeanette = bedrag / aantalmensen;
        uitkomstTimo = bedrag / aantalmensen;
    }

    public void paint(Graphics g) {
        setBackground(achtergrondkleur);
        g.setColor(tekstkleur);
        g.drawString("De uitkomst voor Jan is:" + uitkomstJan, 20,20);
        g.drawString("De uitkomst voor Ali is:" + uitkomstAli, 20,35);
        g.drawString("De uitkomst voor Jeanette is:" + uitkomstJeanette, 20,50);
        g.drawString("De uitkomst voor Timo is:" + uitkomstTimo, 20,65);
    }
}
