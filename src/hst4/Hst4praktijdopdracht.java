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

        //dit is de rechthoek
        g.drawRect(10,20,100,40);

        //dit is de afgeronde rechthoek
        g.drawRoundRect(10,70,100,40,30,30);

        //dit is de gevulde rechthoek met de ovaal er in
        g.setColor(Color.magenta);
        g.fillRect(120,20,100,40);
        g.setColor(Color.black);
        g.drawArc(120,20,100,40,0,360);

        //dit is de gevulde ovaal
        g.setColor(Color.magenta);
        g.fillArc(120,70,100,40,0,360);

        //dit is de taartpunt met ovaal eromheen
        g.setColor(Color.BLACK);
        g.drawArc(230,20,100,40,0,360);
        g.setColor(Color.magenta);
        g.fillArc(230,20,100,40,0,45);

        //dit is de cirkel
        g.setColor(Color.cyan);
        g.drawArc(230,70,70,70,0,360);
    }
}
