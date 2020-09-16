package hst11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    //decleratie
    TextField tekstvak;
    Button ok;

    public void init() {
        tekstvak = new TextField("");
        ok = new Button("oké");
        tekstvak.addActionListener(new submit());
        ok.addActionListener(new submit());
    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
