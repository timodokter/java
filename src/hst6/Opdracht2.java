package hst6;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    //decleratie
    Color achtergrondkleur;
    Color tekstkleur;
    double uitkomstjaar;
    double uitkomstdag;
    double uitkomstuur;
    double uitkomstminuut;
    int secperminuut;
    int secperuur;
    int secperdag;
    int secperjaar;

    public void init() {
        //initialisatie
        achtergrondkleur = Color.black;
        tekstkleur = Color.white;
        secperminuut = 60;
        secperuur = 60 * secperminuut;
        secperdag = 24 * secperuur;
        secperjaar = 365 * secperdag;
        uitkomstminuut = secperminuut;
        uitkomstuur = secperuur;
        uitkomstdag = secperdag;
        uitkomstjaar = secperjaar;
    }

    public void paint(Graphics g) {
        setBackground(achtergrondkleur);
        g.setColor(tekstkleur);
        g.drawString("Het aantal seconden per uur is: " + uitkomstuur,20,20);
        g.drawString("Het aantal seconden per dag is: " + uitkomstdag,20,35);
        g.drawString("Het aantal seconden per jaar is: " + uitkomstjaar,20,50);
    }
}
