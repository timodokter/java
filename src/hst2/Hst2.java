package hst2;

import java.applet.Applet;
import java.awt.*;

public class Hst2 extends Applet {
    @Override
    public void init() {
        super.init();
        setBackground(Color.blue);
    }

    @Override
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.drawString("Timo", 200, 200);
        super.paint(g);
        g.setColor(Color.yellow);
        g.drawString("Dokter", 230, 200);
    }
}
