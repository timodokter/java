package hst8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet{
    //decleratie
    int m;
    int v;
    int pml;
    int pvl;
    int totaal;
    Label label;
    TextField tekstvak;
    Button man;
    Button vrouw;
    Button pmanl;
    Button pvrouwl;
    int sm;
    String sv;
    String spmanl;
    String spvrouwl;

    public void init() {
        //initialisatie
        setSize(800,400);
        tekstvak = new TextField("");
        label = new Label("type in het tekstvak het aantal mensen voor die groep");
        man = new Button("mannelijk");
        vrouw = new Button("vrouwlijk");
        pmanl = new Button("potientiele mannelijke leerlingen");
        pvrouwl = new Button("potientiele vrouwlijke leerlingen");

        //initialisatie personen
        m = 0;
        v = 0;
        pml = 0;
        pvl = 0;
        totaal = m + v + pml + pvl;
        sm = 0;

        //button initilisatie
        man.addActionListener(new knoplistenerman() );

        //add initialisatie
        add(label);
        add(tekstvak);
        add(man);
        add(vrouw);
        add(pmanl);
        add(pvrouwl);
    }

    public void paint(Graphics g) {
    g.drawString("mannelijke bezoekers: ",20,50);
    g.drawString("vrouwlijke bezoekers: ", 20,65);
    g.drawString("potientiele mannelijke leerlingen: ",20,80);
    g.drawString("potientiele vrouwlijke leerlingen: ",20,95);
    g.drawString("Totale aantal bezoekers: ",20,110);
    }

    class knoplistenerman implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            sm = tekstvak.getText();
            repaint();
        }
    }
}
