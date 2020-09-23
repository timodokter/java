package hst14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht2 extends Applet {

    //decleratie
    double kleurkiezer;
    double nummerkiezer;
    String[] deck;

    String[] kleur = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer"};
    String gekozen;
    Button delen;

    private String deelkaart() {
        int random = new Random.nextInt(deck.length);
        String kaart = (deck[random]);

        String[] hulplijst= new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulplijst[hulpindex] = (deck[i]);

            }
        }

        deck = hulplijst;

        return kaart;
        return kaart;
    }
}
