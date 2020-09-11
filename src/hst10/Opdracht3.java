package hst10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    //decleratie

    Label label;
    TextField tmaand;
    String smaand;
    String sdagen;
    String antwoord;
    double dmaand;

    public void init() {
        //initialisatie
        setSize(800, 400);
        antwoord = "";
        smaand = "dit is geen geldig nummer";
        label = new Label("type een maand nummer in het tekstvak en druk op enter.");
        tmaand = new TextField("",5);
        tmaand.addActionListener(new textlistenertmaand());

        //initialisatie add's
        add(label);
        add(tmaand);
    }

    public void paint(Graphics g) {
        g.drawString("dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + antwoord,20,50);
    }

    private class textlistenertmaand implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            smaand = tmaand.getText();
            dmaand = Double.parseDouble(smaand);
            if (dmaand == 1) {
                smaand = "Januari";
                sdagen = "31";
                antwoord = smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 2) {
                smaand = "Februari";
                sdagen = "";
                antwoord = smaand + " en " + sdagen + " dagen.";
            }
            repaint();
        }
    }
}
