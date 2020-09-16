package hst11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    //decleratie
    int a;
    TextField tekstvak;
    Button ok;


    public void init() {
        tekstvak = new TextField("",5);
        ok = new Button("oké");
        tekstvak.addActionListener(new submit());
        ok.addActionListener(new submit());

        add(tekstvak);
        add(ok);
    }

    public void paint(Graphics g) {

    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
