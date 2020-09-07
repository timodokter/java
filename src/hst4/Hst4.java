package hst4;

import java.awt.*;
import java.applet.*;

public class Hst4  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        //dit is de gelijkbenige driehoek
        g.setColor(Color.blue);
        g.drawLine(50,120,100,70);
        g.drawLine(100,70,150,120);
        g.drawLine(50,120,150,120);

        //dit is het huisje
        g.setColor(Color.GREEN);
        g.drawRect(170,70,100,80);
    }
}
