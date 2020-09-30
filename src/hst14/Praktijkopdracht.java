package hst14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {

    public AudioClip sound;
    private Image afbeelding;
    TextField tekstvak = new TextField("",5);
    Button speel = new Button("speel");
    Button reset = new Button("reset");

    int smileys = 23;
    boolean turn = false;
    boolean gameover = false;
    boolean lost = false;

    String tekst1 = "";
    String tekst2 = "voer 1, 2 of 3 in en druk op speel";
    String winner = "Winner!";

    public void init() {

        //initialisatie
        setSize(700,500);

        tekst1 = tekst2;

        //knoppen
        speel.addActionListener(new speler());
        reset.addActionListener(new reseter());
        add(tekstvak);
        add(speel);
        add(reset);

        //de smileys
        URL pad = Praktijkopdracht.class.getResource("./resources/");
        afbeelding = getImage(pad, "smiley.jpg");

        //geluid als je wint
        URL pad2 = Praktijkopdracht.class.getResource("./resources/");
        sound = getAudioClip(pad2, "applaus.wav");
    }

    public void paint(Graphics g) {
        g.drawString(tekst1,70,50);
        g.drawString("er zijn nog: " + smileys + " smileys",70,70);
        for (int i = 0; i < smileys; i++) {
            g.drawImage(afbeelding,70 + 50 * (i % 4), 75 + 50 * (i / 4), 50, 50, this);
        }
        if (tekst1 == winner) {
            sound.play();
        }
    }

    int botspeelt(int spelerzet, int smileys) {
        int botspeelt = 0;
        double random = Math.random() * 3 + 1;
        int r = (int) random;

        if (smileys == 23) {
            switch (spelerzet) {
                case 1:
                    botspeelt = 1;
                    break;
                case 2:
                    botspeelt = r;
                    break;
                case 3:
                    botspeelt = 3;
                    break;
            }
        } else if (smileys == 21 || smileys == 17 || smileys == 13 || smileys == 9 || smileys == 5) {
            switch (spelerzet) {
                case 1:
                    botspeelt = 3;
                    break;
                case 2:
                    botspeelt = 2;
                    break;
                case 3:
                    botspeelt = 1;
                    break;
            }
        }else if(smileys == 20 || smileys == 16 || smileys == 12 || smileys == 8|| smileys == 4){
            switch(spelerzet) {
                case 1:
                    botspeelt = 2;
                    break;
                case 2:
                    botspeelt = 1;
                    break;
                case 3:
                    botspeelt = r;
                    break;
            }
        }else if(smileys == 19 || smileys == 15 || smileys == 11 || smileys == 7|| smileys == 3){
            switch(spelerzet) {
                case 1:
                    botspeelt = 1;
                    break;
                case 2:
                    botspeelt = r;
                    break;
                case 3:
                    botspeelt = 3;
                    break;
            }
        }else if(smileys == 18 || smileys == 14 || smileys == 10 || smileys == 6|| smileys == 2){
            switch(spelerzet) {
                case 1:
                    botspeelt = r;
                    break;
                case 2:
                    botspeelt = 3;
                    break;
                case 3:
                    botspeelt = 2;
                    break;
            }
        }else {
            botspeelt = r;
        }

        return botspeelt;
    }

    private class speler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int spelerzet = 0 ;
            int bot = 0;

            if (Integer.parseInt(tekstvak.getText()) == 1 || Integer.parseInt(tekstvak.getText()) == 2 || Integer.parseInt(tekstvak.getText()) == 3) {
                spelerzet = Integer.parseInt(tekstvak.getText());
                bot = botspeelt(spelerzet, smileys);

                turn = true;
                smileys -= spelerzet;
                if (smileys <= 0 && gameover == false) {
                    if (true == true) {
                        lost = true;
                        gameover = true;
                    }
                }
                turn = false;
                smileys -= bot;
                if (smileys <= 0 && gameover == false) {
                    lost = false;
                    gameover = true;
                }

                tekst1 = "Bot koos " + bot + " Smileys weg te halen";

            }else {
                tekst1 = "ERROR: dit getal kan niet verwerkt worden voer een getal tussen de 1-3";
                repaint();
            }

            if (gameover == true) {
                if (lost == false) {
                    tekst1 = winner;
                } else {
                    tekst1 = "Loser!";
                }
            }

            tekstvak.setText("");
            repaint();
        }
    }

    private class reseter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekst1 = tekst2;
            smileys = 23;
            lost = false;
            gameover = false;
            turn = true;
            repaint();
        }
    }
}
