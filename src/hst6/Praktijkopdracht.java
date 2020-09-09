package hst6;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet{
    //decleratie
    Color achtergrondkleur;
    Color tekstkleur;
    double uitkomst;
    double cijfer1;
    double cijfer2;
    double cijfer3;
    int uitkomstgemiddelde;
    int definitieveuitkomst;

    public void init() {
        //initialisatie
        achtergrondkleur = Color.black;
        tekstkleur = Color.white;
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / 3;
        uitkomstgemiddelde = (int) (uitkomst * 10);
        definitieveuitkomst = (int) (uitkomstgemiddelde / 10);
    }

    public void paint(Graphics g) {
        setBackground(achtergrondkleur);
        g.setColor(tekstkleur);
        g.drawString("Het gemiddelde is: " + definitieveuitkomst,20,20);
    }
}
