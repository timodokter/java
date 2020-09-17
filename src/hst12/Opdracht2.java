package hst12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //decleratie
    Button buttons[] = new Button[25];

    public void init() {
        for (int i = 0; i != 25; i++) {
            buttons[i] = new Button("knop " + String.valueOf(i + 1));
            add(buttons[i]);
        }
    }
}
