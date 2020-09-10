package hst8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet{
    //decleratie
    Label label;
    TextField tekstvak;
    Button man;
    Button vrouw;
    Button pmanl;
    Button pvrouwl;
    String sm;
    double dm;
    String sv;
    double dv;
    String spmanl;
    double dpmanl;
    String spvrouwl;
    double dpvrouwl;
    String stotaal;
    double dtotaal;
    String sopsommingtotaal;
    double dopsommingtotaal;

    public void init() {
        //initialisatie
        setSize(800,400);
        tekstvak = new TextField("",5);
        label = new Label("type in het tekstvak het aantal mensen voor die groep");
        man = new Button("mannelijk");
        vrouw = new Button("vrouwlijk");
        pmanl = new Button("potientiele mannelijke leerlingen");
        pvrouwl = new Button("potientiele vrouwlijke leerlingen");

        //initialisatie personen
        dm = 0;
        sm = Double.toString(dm);
        dv = 0;
        sv = Double.toString(dv);
        dpmanl = 0;
        spmanl = Double.toString(dpmanl);
        dpvrouwl = 0;
        spvrouwl = Double.toString(dpvrouwl);
        dtotaal = 0;
        stotaal = Double.toString(dtotaal);
        dtotaal = Double.parseDouble(sm)+Double.parseDouble(sv)+Double.parseDouble(spmanl)+Double.parseDouble(spvrouwl);

        //button initilisatie
        man.addActionListener(new knoplistenerman() );
        vrouw.addActionListener(new knoplistenervrouw());
        pmanl.addActionListener(new knoplistenerpmanl());
        pvrouwl.addActionListener(new knoplistenerpvrouwl());

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
    g.drawString(sm,150,50);
    g.drawString(sv,150,65);
    g.drawString(spmanl,210,80);
    g.drawString(spvrouwl,200,95);
    g.drawString(stotaal,160,110);
    }

    class knoplistenerman implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            sm = tekstvak.getText();
            dtotaal = Double.parseDouble(sm)+Double.parseDouble(sv)+Double.parseDouble(spmanl)+Double.parseDouble(spvrouwl);
            stotaal = Double.toString(dtotaal);
            repaint();
        }
    }

    class knoplistenervrouw implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            sv = tekstvak.getText();
            dtotaal = Double.parseDouble(sm)+Double.parseDouble(sv)+Double.parseDouble(spmanl)+Double.parseDouble(spvrouwl);
            stotaal = Double.toString(dtotaal);
            repaint();
        }
    }

    class knoplistenerpmanl implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            spmanl = tekstvak.getText();
            dtotaal = Double.parseDouble(sm)+Double.parseDouble(sv)+Double.parseDouble(spmanl)+Double.parseDouble(spvrouwl);
            stotaal = Double.toString(dtotaal);
            repaint();
        }
    }

    class knoplistenerpvrouwl implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            spvrouwl = tekstvak.getText();
            dtotaal = Double.parseDouble(sm)+Double.parseDouble(sv)+Double.parseDouble(spmanl)+Double.parseDouble(spvrouwl);
            stotaal = Double.toString(dtotaal);
            repaint();
        }
    }
}
