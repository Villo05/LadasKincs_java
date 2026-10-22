package app;

import modell.Ladak;
import nezet.KonzolNezet;
import nezet.Nezet;
import nezet.TablazatNezet;
import vezerlo.LadakVezerloje;

public class main {

    public static void main(String[] args) {
        Ladak modell = new Ladak();

        //Nezet nezet = new KonzolNezet();
        Nezet nezet = new TablazatNezet();

        new LadakVezerloje(nezet, modell);
    }
}
