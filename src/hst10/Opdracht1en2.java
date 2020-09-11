package hst10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1en2 extends Applet{
    //decleratie
    TextField tekstvak;
    double tekst;
    double nummer;
    String s;
    Label label;
    double laagstenummer;

    public void init() {
        //initialisatie tekst
        nummer = 5;
        laagstenummer = 5;
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new tekstvaklistener());
        label = new Label("type een nummer in het tekstvak en drup op enter");

        //initialisatie add
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("het laatste getal dat u heeft ingevoerd is: " + laagstenummer,20,55);
        g.drawString("het hoogste getal dat u heeft ingevoerd is: " + nummer,20,40);
    }

    private class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekst = Double.parseDouble(s);
            if (tekst > nummer ) {
                nummer = tekst;
            }
            if (tekst < laagstenummer) {
                laagstenummer = tekst;
            }
            repaint();
        }
    }
}
