package hst8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button knopoké;
    Button knopreset;
    Label label;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("klik op mij");
        knopoké = new Button("oké");
        knopreset = new Button("reset");
        label = new Label("type iets in het tekstvakje");
        knopreset.addActionListener(new Knoplistener() );
        add(label);
        add(tekstvak);
        add(knopoké);
        add(knopreset);
    }

    public void paint(Graphics g) {
        g.drawString("type een hele lange tekst " + "in het tekstvakje" + "en klik op oké",50,60 );
    }

    class Knoplistener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
}