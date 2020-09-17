package hst12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    //decleratie
    int[] getallen = {10,43,29,97,45,136,230,210,154};
    int max;

    public void init() {
        max = getallen[0];
        for (int teller = 0; teller < getallen.length; teller++) {
            if (getallen[teller] > max) {
                max = getallen[teller];
                break;
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString("het maximum is: " + max,20,50);
    }
}