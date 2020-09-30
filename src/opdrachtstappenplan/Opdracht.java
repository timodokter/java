package opdrachtstappenplan;

import java.applet.Applet;

public class Opdracht extends Applet {
    //decleratie
    int getal;
    int kwadraat;

    public void init() {
        //initialisatie
        getal = 13;
        if (getal >= 0 && getal == (int)getal) {
            for (int x = 1; x <= getal; x++) {
                if (x % 2 == 0) {
                    if (x % 6 == 0) {
                        kwadraat = x * x;
                        System.out.println(kwadraat);
                    }
                }
            }
        }
    }
}
