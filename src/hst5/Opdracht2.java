package hst5;

import java.applet.*;
import java.awt.*;

public class Opdracht2 extends Applet{

    //decleratie
    Color lijnkleur;
    Color opvulkleurV;
    Color opvulkleurJ;
    Color opvulkleurH;
    Color achtergrond;
    int hoogteV;
    int hoogteJ;
    int hoogteH;
    int breedte;

    public void init() {
     //initialisatie
     lijnkleur = Color.blue;
     opvulkleurV = Color.CYAN;
     opvulkleurJ = Color.red;
     opvulkleurH = Color.orange;
     achtergrond = Color.BLACK;
     hoogteV = 80;
     hoogteJ = 200;
     hoogteH = 160;
     breedte = 40;
    }

    public void paint(Graphics g) {

        setBackground(achtergrond);

        //dit zijn de assen
        g.setColor(lijnkleur);
        g.drawLine(30,30,30,230);
        g.drawLine(30,230,180,230);

        //dit is Valerie
        g.setColor(opvulkleurV);
        g.fillRect(40,150,breedte,hoogteV);

        //dit is jeroen
        g.setColor(opvulkleurJ);
        g.fillRect(90,30,breedte,hoogteJ);

        //dit is hans
        g.setColor(opvulkleurH);
        g.fillRect(140,70,breedte,hoogteH);

        //dit is de data
        g.setColor(lijnkleur);
        g.drawString("kg",25,25);
        g.drawString("100-",6,34);
        g.drawString("80-",13,75);
        g.drawString("60-",13,115);
        g.drawString("40-",13,154);
        g.drawString("20-",13,190);

        //dit zijn de namen
        g.setColor(lijnkleur);
        g.drawString("Valerie",40,245);
        g.drawString("Jeroen",90,245);
        g.drawString("Hans",145,245);
    }
}
