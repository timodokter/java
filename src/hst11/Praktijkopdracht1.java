package hst11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1 extends Applet {
    //decleratie
    int a;
    long antwoord;
    TextField tekstvak;
    Button ok;


    public void init() {
        a = 0;
        antwoord = 0;
        tekstvak = new TextField("",5);
        ok = new Button("oké");
        tekstvak.addActionListener(new submit());
        ok.addActionListener(new submit());

        add(tekstvak);
        add(ok);
    }

    public void paint(Graphics g) {
        for (int i=1; i<=10; i++) {
            antwoord = a * i;
            g.drawString("" + antwoord,90,i * 20 + 30 );
        }

        //Berekeningen Tafels
        g.drawString("1 x " + a + "=",50,50);
        g.drawString("2 x " + a + "=",50,70);
        g.drawString("3 x " + a + "=",50,90);
        g.drawString("4 x " + a + "=",50,110);
        g.drawString("5 x " + a + "=",50,130);
        g.drawString("6 x " + a + "=",50,150);
        g.drawString("7 x " + a + "=",50,170);
        g.drawString("8 x " + a+ "=",50,190);
        g.drawString("9 x " + a + "=",50,210);
        g.drawString("10 x " + a + "=",45,230);
    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }
}
