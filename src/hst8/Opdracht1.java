package hst8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button knopoke;
    Button knopreset;
    Label label;
    TextField tekstvak;
    String s;

    public void init() {
        tekstvak = new TextField("klik op mij");
        knopoke = new Button("oké");
        knopreset = new Button("reset");
        label = new Label("type uw gebruikers naam in het tekstvak en druk dan op oké");
        knopreset.addActionListener(new Knoplistenerreset() );
        knopoke.addActionListener(new Knoplisteneroke() );
        add(label);
        add(tekstvak);
        add(knopoke);
        add(knopreset);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Gebruikersnaam: ",50,70 );
        g.drawString(s,150,70);
    }

    class Knoplistenerreset implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }

    class Knoplisteneroke implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
}