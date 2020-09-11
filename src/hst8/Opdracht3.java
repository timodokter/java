package hst8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet{

    //decleratie
    Label label;
    TextField tekstvak;
    Button oke;
    String s;
    double bedrag;

    public void init() {
        //initialisatie
        bedrag = 0;
        label = new Label("type het bedrag waarbij u 21% BTW wilt optellen hiernaast in het tekstvak");
        tekstvak = new TextField("type hier het bedrag",15);
        oke = new Button("oké");
        s = "";

        //initialisatieknoppen
        oke.addActionListener(new knoplisteneroke());

        //initialisatie add's
        add(label);
        add(tekstvak);
        add(oke);
    }

    public void paint(Graphics g) {
        g.drawString("bedrag inc. BTW: ",20,80);
        g.drawString(String.valueOf(bedrag),115,80);
    }

    private class knoplisteneroke implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        s = tekstvak.getText();
        bedrag = Double.parseDouble(s);
        bedrag *= 1.21;
        repaint();
        }
    }
}
