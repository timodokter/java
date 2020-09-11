package hst8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijdopdracht extends Applet{
    //decleratie
    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button keer;
    Button delen;
    double t1;
    double t2;
    double uitkomst;
    String suitkomst;

    public void init() {
        //initialisatie tekst
        t1 = 0.0;
        t2 = 0.0;
        tekstvak1 = new TextField("", 5);
        tekstvak2 = new TextField("", 5);

        //initialisatie Button's
        plus = new Button("+");
        min = new Button("-");
        keer = new Button("*");
        delen = new Button("/");
        plus.addActionListener(new knoplistenerplus());
        min.addActionListener(new knoplistenermin());
        keer.addActionListener(new knoplistenerkeer());
        delen.addActionListener(new knoplistenerdelen());

        //initialisatie add
        add(tekstvak1);
        add(tekstvak2);
        add(plus);
        add(min);
        add(keer);
        add(delen);
    }


    private class knoplistenerplus implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(tekstvak1.getText());
            t2 = Double.parseDouble(tekstvak2.getText());
            uitkomst = t1 + t2;
            suitkomst = String.valueOf(uitkomst);
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    private class knoplistenermin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(tekstvak1.getText());
            t2 = Double.parseDouble(tekstvak2.getText());
            uitkomst = t1 - t2;
            suitkomst = String.valueOf(uitkomst);
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    private class knoplistenerkeer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(tekstvak1.getText());
            t2 = Double.parseDouble(tekstvak2.getText());
            uitkomst = t1 * t2;
            suitkomst = String.valueOf(uitkomst);
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    private class knoplistenerdelen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(tekstvak1.getText());
            t2 = Double.parseDouble(tekstvak2.getText());
            uitkomst = t1 / t2;
            suitkomst = String.valueOf(uitkomst);
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
}
