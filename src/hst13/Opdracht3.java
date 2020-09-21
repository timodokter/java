package hst13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    //decleratie
    Button steen;
    Button beton;
    Button reset;
    int muur = 0;

    public void init() {
        setSize(1200,700);
        //de knoppen
        steen = new Button("stenen muur");
        beton = new Button("betonnen muur");
        reset = new Button("reset");

        //acties voor de knoppen
        steen.addActionListener(new stenen());
        beton.addActionListener(new betonnen());
        reset.addActionListener(new reseten());

        //add's
        add(steen);
        add(beton);
        add(reset);
    }

    public void paint(Graphics g) {

        switch (muur) {
            case 0:
                break;
            case 1:
                stenenmuur(g,0,0,1200,700);
                break;
            case 2:
                betonnenmuur(g,0,0,1200,700);
                break;
            default:
                break;
        }
    }

    private void betonnenmuur(Graphics g, int x, int y, int w, int h) {

        //kleur en achtergrond
        g.setColor(new Color(100,100,100));
        g.fillRect(x,y,w,h);
        g.setColor(new Color(180,182,182));

        //de stenen
        for (int a = 0; a <= ((h - 5) / 50) - 1; a++){
            if (a % 2 == 0) {
                for (int b = 0; b <= ((w - 5) / 95) - 1; b++) {
                    g.fillRect((x + 5) + 95 * b, (y + 5) + 50 * a, 90, 45);
                }
            } else {
                for (int c = 0; c <= ((w - 5) / 95) - 2; c++) {
                    g.fillRect((x + 55) + 95 * c, (y + 5) + 50 * a, 90, 45);
                    g.fillRect((x + 5), (y + 5) + 50 * a, 45, 45);
                    g.fillRect(x + (((w - 5) / 95) * 95 - 40), (y + 5) + 50 * a, 40, 45);
                }
            }
        }
    }

    void stenenmuur(Graphics g, int x, int y, int w, int h) {

        //kleur en achtergrond
        g.setColor(new Color(100,100,100));
        g.fillRect(x,y,w,h);
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

    private class stenen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            muur = 1;
            repaint();
        }
    }

    private class betonnen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            muur = 2;
            repaint();
        }
    }

    private class reseten implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            muur = 0;
            repaint();
        }
    }
}
