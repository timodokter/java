package hst11;

import java.applet.*;
import java.awt.*;

public class Test extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        for(int I=11; I<=20; I++) {
            g.drawString("" + I,50,I*10);
        }
    }
}