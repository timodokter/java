package hst5;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    //decleratie
    Color opvulkleur;
    Color lijnkleur;
    Color achtergrond;
    int breedte;
    int hoogte;
    int breedte2;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        achtergrond = Color.GRAY;
        breedte = 200;
        hoogte = 100;
        breedte2 = 100;
    }

    public void paint(Graphics g) {

        setBackground(achtergrond);

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
        g.drawArc(520,100,breedte,hoogte,0,360);
        g.setColor(opvulkleur);
        g.fillArc(520,100,breedte,hoogte,0,45);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawArc(520,225,breedte2,hoogte,0,360);

        //teksten
        g.setColor(lijnkleur);
        g.drawString("Lijn",100,95);
        g.drawString("Rechthoek",15,25);
        g.drawString("Afgeronde rechhoek",15,75);
        g.drawString("Gevulde rechthoek met ovaal",125,20);
        g.drawString("Gevulde ovaal",125,80);
        g.drawString("Taartpunt met ovaal eromheen",235,25);
        g.drawString("Cirkel",235,70);

    }
}
