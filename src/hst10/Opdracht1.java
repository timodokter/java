package hst10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet{
    //decleratie
    TextField tekstvak;
    double tekst;
    double nummer;
    String s;
    Label label;

    public void init() {
        //initialisatie tekst
        nummer = 5;
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new tekstvaklistener());
        label = new Label("type een nummer in het tekstvak en drup op enter");

        //initialisatie add
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("het hoogste getal dat u heeft ingevoerd is: " + nummer,20,40);
    }

    private class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekst = Double.parseDouble(s);
            if (tekst > nummer ) {
                nummer = tekst;
            }
            repaint();
        }
    }
}
