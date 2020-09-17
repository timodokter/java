package hst12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    //decleratie
    String[] namen = new String[10];
    int[] nummers = new int[10];
    Label label = new Label("Voer uw naam en telefoonnummer in");
    Button ok = new Button("oké");

    //naam
    Label lnaam = new Label("naam: ");
    TextField tnaam = new TextField("",5);

    //nummers
    Label lnummer = new Label("telefoonnummer: ");
    TextField tnummer = new TextField("",5);

    //variabelen
    int niettonen = 0;
    int tonen = 10;

    public void init() {

        //initialisatie
        setSize(800,400);
        ok.addActionListener(new listener());
        add(label);
        add(lnaam);
        add(tnaam);
        add(lnummer);
        add(tnummer);
        add(ok);
    }

    public void paint(Graphics g) {
        if (niettonen == 10) {
            for (int i = 0; i < 10; i++) {
                String nummers = (i + 1) + "";
                g.drawString("naam: " + namen[i] + " telefoonnummers: " + nummers,20, 50 + (i + 1) * 15);
            }
        } else {
            g.drawString("nog " + tonen + " telefoonnummers en namen te gaan", 20, 50);
        }
    }

    private class listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            namen[niettonen] = tnaam.getText();
            nummers[niettonen] = Integer.parseInt(tnummer.getText());
            niettonen++;
            tonen--;
            repaint();

            //reset
            tnaam.setText("");
            tnummer.setText("");
        }
    }
}
