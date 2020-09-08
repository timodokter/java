package hst4;

import java.applet.*;
import java.awt.*;

public class Hst4praktijdopdracht extends Applet{

    @Override
    public void init() {}

    public void paint(Graphics g) {

        setBackground(Color.LIGHT_GRAY);
        g.setColor(Color.CYAN);

        //dit is de lijn
        g.drawLine(10,10,110,10);
        g.setColor(Color.black);
        g.drawString("Lijn",55,25);

        //dit is de rechthoek
        g.setColor(Color.CYAN);
        g.drawRect(10,30,100,40);
        g.setColor(Color.black);
        g.drawString("Rechthoek",30,85);

        //dit is de afgeronde rechthoek
        g.setColor(Color.CYAN);
        g.drawRoundRect(10,90,100,40,30,30);
        g.setColor(Color.black);
        g.drawString("Afgeronde Rechthoek",5,145);

        //dit is de gevulde rechthoek met de ovaal er in
        g.setColor(Color.magenta);
        g.fillRect(120,30,100,40);
        g.setColor(Color.black);
        g.drawArc(120,30,100,40,0,360);
        g.drawString("Gevulde rechthoek",120,85);
        g.drawString("met ovaal",140,100);

        //dit is de gevulde ovaal
        g.setColor(Color.magenta);
        g.fillArc(120,110,100,40,0,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",130,160);

        //dit is de taartpunt met ovaal eromheen
        g.setColor(Color.BLACK);
        g.drawArc(230,20,100,40,0,360);
        g.setColor(Color.magenta);
        g.fillArc(230,20,100,40,0,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met",245,75);
        g.drawString("ovaal eromheen",235,90);

        //dit is de cirkel
        g.setColor(Color.cyan);
        g.drawArc(230,100,70,70,0,360);
        g.setColor(Color.black);
        g.drawString("cirkel",250,185);
    }
}
