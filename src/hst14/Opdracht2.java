package hst14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.net.URL;

public class Opdracht2 extends Applet {

    //decleratie
    String[] deck;
    String[] kleur = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer"};
    Button delen;
    private URL pad;
    private AudioClip sound;

    boolean[] hulp;
    int start = 0;

    public void init() {

        //initialisatie
        setSize(500,300);

        delen = new Button("deel kaarten");
        delen.addActionListener(new deler());
        add(delen);

        deck = new String[52];
        hulp = new boolean[52];

        //geluid
        pad = Opdracht2.class.getResource("./resources/");
        sound = getAudioClip(pad, "applaus.wav");

        Arrays.fill(hulp, false);

        for (int i = 0; i < 13; i++) {
            deck[start] = kleur[0] + " " + nummer[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            deck[start] = kleur[1] + " " + nummer[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            deck[start] = kleur[2] + " " + nummer[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            deck[start] = kleur[3] + " " + nummer[i];
            start++;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Speler 1",20,50);
        g.drawString("Speler 2",130,50);
        g.drawString("Speler 3",240,50);
        g.drawString("Speler 4",350,50);
        sound.play();

        int b = 0;
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 13; a++) {
                g.drawString(deck[b],20 + 110 * i, 70 + 12 * a);
                b++;
            }
        }
    }

    public static void Random(String[] randomize) {
        Random randomize1;

        for (int i = 0; i < randomize.length; i++) {
            randomize1 = new Random();
            int randPos = randomize1.nextInt(randomize.length);
            String tmp = randomize[i];
            randomize[i] = randomize[randPos];
            randomize[randPos] = tmp;
        }
    }

    private class deler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random(deck);
            repaint();
        }
    }
}
