package opdrachtstappenplan;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht extends Applet {
    int limietVanInvoerGebruiker;
    int kwadraatVanTafelVanZes;
    int totaleOpsommingVanGetallenInApplet;
    int yCoordinaat;

    String tekstVoorSom;

    TextField invoerGetalVanGebruiker;
    Button enter;

    boolean errorMeldingVerkeerdeInvoer = false;

    public void init() {
        limietVanInvoerGebruiker = 0;
        enter = new Button("Enter");
        invoerGetalVanGebruiker = new TextField("",10);
        add(invoerGetalVanGebruiker);
        add(enter);
        submit submit = new submit();
        enter.addActionListener(submit);
        invoerGetalVanGebruiker.addActionListener(submit);
        totaleOpsommingVanGetallenInApplet = 0;
        tekstVoorSom = "de som = ";
        yCoordinaat = 50;
    }

    public void paint(Graphics g) {
        doAlles(g);
    }

    private void doAlles(Graphics g){
        if (limietVanInvoerGebruiker >= 0) {
            for (int huidigGetal = 1; huidigGetal <= limietVanInvoerGebruiker; huidigGetal++) {
                if (huidigGetal % 2 == 0) {
                    if (huidigGetal % 6 == 0) {
                        kwadraatVanTafelVanZes = huidigGetal * huidigGetal;
                        g.drawString("" + kwadraatVanTafelVanZes, 20, yCoordinaat);
                        totaleOpsommingVanGetallenInApplet = totaleOpsommingVanGetallenInApplet + kwadraatVanTafelVanZes;
                    } else {
                        g.drawString("" + huidigGetal, 20, yCoordinaat);
                        totaleOpsommingVanGetallenInApplet = totaleOpsommingVanGetallenInApplet + huidigGetal;
                    }
                    yCoordinaat += 15;
                }
            }
            this.displayUitkomst(g);
        }
    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input;
            input = invoerGetalVanGebruiker.getText();
            try {
                limietVanInvoerGebruiker = Integer.parseInt(input);
            } catch (Exception s) {
                errorAfhandeling(false);
            }
            if (limietVanInvoerGebruiker < 0) {
                errorAfhandeling(true);
            }
            repaint();
        }
    }

    private void displayUitkomst (Graphics g) {
        if (totaleOpsommingVanGetallenInApplet != 0) {
            g.drawString("" + tekstVoorSom + totaleOpsommingVanGetallenInApplet,20, yCoordinaat);
            totaleOpsommingVanGetallenInApplet = 0;
        } else if (errorMeldingVerkeerdeInvoer == true){
            g.drawString("" + tekstVoorSom,20, yCoordinaat);
        }
    }

    private void errorAfhandeling (boolean invoerIsGetal) {
        limietVanInvoerGebruiker = 0;
        errorMeldingVerkeerdeInvoer = true;
        if (invoerIsGetal == true) {
            tekstVoorSom = "ERROR! u moet een positief getal invoeren niet een negatief getal.";
        } else {
            tekstVoorSom = "ERROR! u moet een positief getal invoeren niet een woord of een letter.";
        }
    }
}