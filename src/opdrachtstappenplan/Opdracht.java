package opdrachtstappenplan;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht extends Applet {
    //decleratie
    int getal;
    int kwadraat;
    String uitkomst;
    int y;
    TextField tekstvak;
    Button enter;

    public void init() {
        //initialisatie
        getal = 0;
        enter = new Button("Enter");
        tekstvak = new TextField("",10);
        add(tekstvak);
        add(enter);
        submit submit = new submit();
        enter.addActionListener(submit);
        tekstvak.addActionListener(submit);
    }

    public void paint(Graphics g) {
        y = 20;
        if (getal >= 0 && getal == (int)getal) {
            for (int x = 1; x <= getal; x++) {
                if (x % 2 == 0) {
                    if (x % 6 == 0) {
                        kwadraat = x * x;
                        g.drawString("" + kwadraat, 20, y);

                    } else {
                        System.out.println(x);
                        uitkomst = "" + x;
                        g.drawString("" + x, 20,y);
                    }
                    y += 15;
                }
            }
        }
    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input;
            input = tekstvak.getText();
            getal = Integer.parseInt(input);

        }
    }
}
