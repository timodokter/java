package hst11;

import com.sun.deploy.security.SelectableSecurityManager;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {

    public void paint(Graphics g) {
        g.drawRect(50,50,200,200);
        for (int i=8; i!=0; i--) {
            if (i%2 == 0) {
                for (int a=8; a!=0; a--) {
                    if (a%2 == 0) {
                        g.fillRect(25+25*a,25+25*i,25,25);
                    }
                    else{
                        g.drawRect(25+25*a,25+25*i,25,25);
                    }
                }
            }
            else {
                for (int b=8; b!=0; b--) {
                    if (b%2 == 0) {
                        g.drawRect(25+25*b,25+25*i,25,25);
                    }
                    else{
                        g.fillRect(25+25*b,25+25*i,25,25);
                    }
                }
            }
        }
    }
}
