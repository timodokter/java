package hst8;

import java.applet.Applet;
import java.awt.*;


public class Praktijdopdracht extends Applet{
    //decleratie
    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button keer;
    Button delen;

    public void init() {
        //initialisatie tekst
        tekstvak1 = new TextField("", 5);
        tekstvak2 = new TextField("", 5);

        //initialisatie Button's
        plus = new Button("+");
        min = new Button("-");
        keer = new Button("*");
        delen = new Button

        //initialisatie add
        add(tekstvak1);
        add(tekstvak2);
    }
}
