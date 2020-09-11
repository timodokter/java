package hst10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
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
        label = new Label("type een maand nummer in het tekstvak en druk op enter. op deze manier: 2020,1 dus links het jaar en rechts de maand");
        tmaand = new TextField("",5);
        tmaand.addActionListener(new textlistenertmaand());

        //initialisatie add's
        add(label);
        add(tmaand);
    }

    public void paint(Graphics g) {
        g.drawString(antwoord,20,50);
    }

    private class textlistenertmaand implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            smaand = tmaand.getText();
            dmaand = Double.parseDouble(smaand);
            if (dmaand == 1) {
                smaand = "Januari";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 2) {
                smaand = "Februari";
                sdagen = "28 of 29";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 3) {
                smaand = "Maart";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 4) {
                smaand = "April";
                sdagen = "30";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 5) {
                smaand = "Mei";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 6) {
                smaand = "Juni";
                sdagen = "30";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 7) {
                smaand = "Juli";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 8) {
                smaand = "Augustus";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 9) {
                smaand = "September";
                sdagen = "30";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 10) {
                smaand = "Oktober";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 11) {
                smaand = "November";
                sdagen = "30";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand == 12) {
                smaand = "December";
                sdagen = "31";
                antwoord = "dit is de maand die bij uw nummer hoort en hoeveel dagen deze maand heeft: " + smaand + " en " + sdagen + " dagen.";
            }
            if (dmaand >= 13){
                antwoord = "dit nummer is geen geldige maand";
            }
            repaint();
        }
    }
}
