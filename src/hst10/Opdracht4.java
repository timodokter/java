package hst10;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    //decleratie

    Label labelmaand;
    TextField tmaand;
    TextField tjaar;
    String sjaar;
    String smaand;
    String sdagen;
    String antwoord;
    double dmaand;
    double djaar;

    public void init() {
        //initialisatie
        setSize(800, 400);
        antwoord = "";
        smaand = "dit is geen geldig nummer";
        labelmaand = new Label("type een maand nummer in het tekstvak en druk op enter. op deze manier jaartal links en maand rechts zo dus: 2020 1");
        tmaand = new TextField("",5);
        tjaar = new TextField("",5);
        tjaar.addActionListener(new textlistenertmaand());
        tmaand.addActionListener(new textlistenertmaand());

        //initialisatie add's
        add(labelmaand);
        add(tjaar);
        add(tmaand);
    }

    public void paint(Graphics g) {
        g.drawString(antwoord,20,50);
    }

    private class textlistenertmaand implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            smaand = tmaand.getText();
            sjaar = tjaar.getText();
            dmaand = Double.parseDouble(smaand);
            djaar = Double.parseDouble(sjaar);
            if ( (djaar % 4 == 0 && !(djaar % 100 == 0)) || djaar % 400 == 0 && dmaand == 2)  {
                smaand = "Februari";
                sdagen = "29";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (!(djaar % 4 == 0 && !(djaar % 100 == 0)) || djaar % 400 == 0 && dmaand == 2) {
                smaand = "Februari";
                sdagen = "28";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 1) {
                smaand = "Januari";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 3) {
                smaand = "Maart";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 4) {
                smaand = "April";
                sdagen = "30";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 5) {
                smaand = "Mei";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 6) {
                smaand = "Juni";
                sdagen = "30";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 7) {
                smaand = "Juli";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 8) {
                smaand = "Augustus";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 9) {
                smaand = "September";
                sdagen = "30";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 10) {
                smaand = "Oktober";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 11) {
                smaand = "November";
                sdagen = "30";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand == 12) {
                smaand = "December";
                sdagen = "31";
                antwoord = "dit is het jaartal en de maand die bij uw nummers hoort en hoeveel dagen deze maand dan heeft: " + smaand + " " + sjaar + " en " + sdagen + " dagen.";
            }
            if (dmaand >= 13){
                antwoord = "dit nummer is geen geldige maand";
            }
            repaint();
        }
    }
}