package hst12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    //decleratie
    boolean gevonden;
    int[] getallen = {10,43,29,97,45,136,230,210,154};
    TextField tekstvak;
    Label label;
    Button ok;
    int gezocht;

    public void init() {
        //initialisatie
        label = new Label("type een cijfer tussen de 1 en de 250");
        tekstvak = new TextField("",5);
        add(label);
        add(tekstvak);
        ok = new Button("oké");
        ok.addActionListener(new listener());
        gevonden = false;
        add(ok);
    }

    public void paint(Graphics g) {
        if (gevonden == true) {
            g.drawString("De waarde is gevonden in de index",20,50);
        }
        else {
            g.drawString("De waarde is niet gevonden in de index",20,50);
        }
    }

    private class listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gevonden = false;
            gezocht = Integer.parseInt(tekstvak.getText());

            for (int i=0; i < getallen.length; i++) {
                if (gezocht == getallen[i]) {
                    gevonden = true;
                    break;
                }
            }
            repaint();
        }
    }
}

