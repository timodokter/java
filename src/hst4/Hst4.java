package hst4;

import java.awt.*;
import java.applet.*;

public class Hst4  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
// dit is opdracht 4.1 tot en met 4.4 en 4.6 tot en met 4.7
        setBackground(Color.black);
        //dit is de gelijkbenige driehoek
        g.setColor(Color.blue);
        g.drawLine(50,120,100,70);
        g.drawLine(100,70,150,120);
        g.drawLine(50,120,150,120);

        //dit is het huisje
        g.setColor(Color.GREEN);
        g.drawRect(170,70,100,80);
        g.drawLine(170,70,270,10);
        g.drawLine(270,10,270,70);
        g.setColor(Color.red);
        g.drawRect(180,90,30,60);
        g.drawRect(220,100,30,20);

        //dit is de flag
        g.setColor(Color.lightGray);
        g.fillRect(320,50,5,100);
        g.setColor(Color.red);
        g.fillRect(325,50,40,10);
        g.setColor(Color.white);
        g.fillRect(325,60,40,10);
        g.setColor(Color.blue);
        g.fillRect(325,70,40,10);

        //dit is het staafdiagram
        g.setColor(Color.white);
        g.drawLine(50,250,50,150);
        g.drawLine(50,250,180,250);
        g.drawString("kg",40,140);
        g.drawString("100-",26,154);
        g.drawString("80-",33,175);
        g.drawString("60-",33,195);
        g.drawString("40-",33,215);
        g.drawString("20-",33,235);
        g.drawString("0-",40,254);
        g.drawString("Valerie",55,260);
        g.drawString("Jeroen",100,260);
        g.drawString("Hans",145,260);
        g.setColor(Color.red);
        g.fillRect(55,212,40,38);
        g.setColor(Color.blue);
        g.fillRect(100,150,40,100);
        g.setColor(Color.GREEN);
        g.fillRect(145,170,30,80);

        //dit is een stoplicht
        g.setColor(Color.gray);
        g.fillArc(200,175,40,30,0,180);
        g.fillRect(200,190,40,60);
        g.fillArc(200,235,40,30,180,180);
        g.setColor(Color.red);
        g.fillArc(210,185,20,20,0,360);
        g.setColor(Color.orange);
        g.fillArc(210,210,20,20,0,360);
        g.setColor(Color.green);
        g.fillArc(210,235,20,20,0,360);

        //dit is de dobbelsteen
        g.setColor(Color.white);
        g.fillRoundRect(250,175,40,40,10,10);
        g.setColor(Color.BLACK);
        g.fillArc(257,182,10,10,0,360);
        g.fillArc(257,197,10,10,0,360);
        g.fillArc(272,182,10,10,0,360);
        g.fillArc(272,197,10,10,0,360);
    }
}