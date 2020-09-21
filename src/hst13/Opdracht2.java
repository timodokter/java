package hst13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setSize(1200,700);
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        tekenmuur(g, 0, 0, 1200, 700);
    }

    private void tekenmuur(Graphics g, int x, int y, int w, int h) {
        //steen kleur
        g.setColor(new Color(132,76,59));

        //de stenen
        for (int a = 0; a <= ((h - 3) / 18) - 1; a++){
            if (a % 2 == 0) {
                for (int b = 0; b <= ((w - 3) / 33) - 1; b++) {
                    g.fillRect((x + 3) + 33 * b, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int c = 0; c <= ((w - 3) / 33) - 2; c++) {
                    g.fillRect((x + 21) + 33 * c, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);
                    g.fillRect(x + (((w - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 12, 15);
                }
            }
        }
    }
}
