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
    int som;
    String sommie;
    boolean error = false;

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
        som = 0;
        sommie = "de som = ";
    }

    public void paint(Graphics g) {
        y = 50;
        if (getal >= 0 && getal == (int)getal) {
            for (int x = 1; x <= getal; x++) {
                if (x % 2 == 0) {
                    if (x % 6 == 0) {
                        kwadraat = x * x;
                        g.drawString("" + kwadraat, 20, y);
                        som = som + kwadraat;
                    } else {
                        System.out.println(x);
                        uitkomst = "" + x;
                        g.drawString("" + x, 20,y);
                        som = som + x;
                    }
                    y += 15;
                }
            }
            if (som != 0) {
                g.drawString("" + sommie + som,20,y);
                som = 0;
            } else if (error == true){
                g.drawString("" + sommie,20,y);
            }
        }
    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input;
            input = tekstvak.getText();
            try {
                getal = Integer.parseInt(input);
            } catch (Exception s) {
                getal = 0;
                error = true;
                sommie = "ERROR! u moet een getal invullen niet een woord of een letter.";
            }
            repaint();
        }
    }
}
