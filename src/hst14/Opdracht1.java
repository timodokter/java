package hst14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ManagementFactory;

public class Opdracht1 extends Applet {

    //decleratie
    double kleurkiezer;
    double nummerkiezer;

    String[] kleur = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer"};
    String gekozen;
    Button delen;

    public void init() {
        //initialisatie
        delen = new Button("deel kaart");
        delen.addActionListener(new listener());
        gekozen = "";
        add(delen);
    }

    public void paint(Graphics g) {
        g.drawString(gekozen,20,50);
    }

    private class listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        kleurkiezer = Math.random() * 4;
        int kk = (int) kleurkiezer;
        nummerkiezer = Math.random() * 13;
        int nk = (int) nummerkiezer;

        gekozen = kleur[kk] + " " + nummer[nk];

        repaint();
        }
    }
}
