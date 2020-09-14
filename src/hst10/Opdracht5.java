package hst10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    //decleratie
    Label label;
    TextField tekstvak;
    double gemiddelde;
    int aantalcijfers;
    Button ok;
    boolean voldoende;
    boolean slaging;

    public void init() {
        //initialisatie
        label = new Label("type een cijfer in het tekstvak.");
        tekstvak = new TextField("",5);
        ok = new Button("oké");
        ok.addActionListener(new knoplistenerok());

        aantalcijfers = 0;
        gemiddelde = 0.0;

        add(label);
        add(tekstvak);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Je gemiddelde cijfer: " + gemiddelde,20,50);
        g.drawString("is het cijfer voldoende?" + voldoende,20,70);
        g.drawString("Aantal cijfers: " + aantalcijfers,20,90);
        g.drawString("ben je geslaagd" + slaging,20,110);
    }

    private class knoplistenerok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double cijfer = Double.parseDouble(tekstvak.getText());
            voldoende = cijfer >= 5.5;
            slaging = gemiddelde >= 5.5;
            gemiddelde = ((gemiddelde * aantalcijfers) + cijfer) / (aantalcijfers + 1);
            gemiddelde = gemiddelde * 10;
            int gemiddelde_ = (int) gemiddelde;
            gemiddelde = gemiddelde_;
            gemiddelde =gemiddelde / 10;
            aantalcijfers++;
            repaint();
        }
    }
}
