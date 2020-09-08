package hst5;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    //decleratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        //Rechthoek
        g.setColor(lijnkleur);
        g.drawRect(100, 100, breedte, hoogte);

        //Afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        //Gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);

        //Ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        //Lijn
        g.setColor(lijnkleur);
        g.drawLine(100,80,300,80);

        //Taartpunt
        g.setColor(lijnkleur);
        g.drawArc();

        //Cirkel


    }
}
