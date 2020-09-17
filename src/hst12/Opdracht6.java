package hst12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
    //decleratie
    int tabel[]  = {4,2,1,4,3,2,3,3,4,2,5};
    TextField tekstvak;
    Label label;
    int index;
    int aantal;

    public void init() {
        label = new Label("type een getal tussen de 1 en de 5 en druk op enter");
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new listener());
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("het ingevulde nummer komt " + aantal + " keer voor.",20,50);
    }

    private class listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal = 0;
            index = Integer.parseInt(tekstvak.getText());
            for (int i=0;i < tabel.length; i++) {
                if (index == tabel[i]) {
                    aantal++;
                }
            }
            repaint();
        }
    }
}