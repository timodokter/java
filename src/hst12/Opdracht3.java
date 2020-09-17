package hst12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    //decleratie
    TextField input[] = new TextField[5];
    Button oke;

    int cijfers[] = new int[5];

    public void init() {

        //initialisatie
        for(int i=0; i!=5; i++) {
            input[i] = new TextField("",5);
            add(input[i]);
        }
        oke = new Button("oké");
        oke.addActionListener(new sorteerder());
        add(oke);
    }

    public void paint(Graphics g) {

    }

    private class sorteerder implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i=0; i!=5; i++){
                cijfers[i] = Integer.parseInt(input[i].getText());
            }
            Arrays.sort(cijfers);
            for (int i=0; i!=5; i++){
                input[i].setText(String.valueOf(cijfers[i]));
            }
            repaint();
        }
    }
}

