package hst8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button knop;
    Label label;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("klik op mij");
        knop = new Button("Klik op mij");
        label = new Label("type iets in het tekstvakje");
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {}
}