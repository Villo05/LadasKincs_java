package nezet;

import modell.Lada;

public class KonzolNezet extends Nezet {

    @Override
    public void megjelenit(Lada[] ladak) {
        System.out.println("Három láda közül az egyik rejti a kincset.");
        System.out.println("Mindegyik ládán van egy felirat, de csak az egyik igaz!");
        System.out.println();
        
        for (int i = 0; i < ladak.length; i++) {
            System.out.println((i + 1) + ". " + ladak[i].getNev() + " láda: \"" + ladak[i].getFelirat() + "\"");
        }
        
        System.out.println();
        System.out.print("Melyik ládában van a kincs? (1-3): ");
    }

    @Override
    public void megjelenitEredmeny(Lada tipp, Lada kincs, boolean talalt) {
        if (talalt) {
            System.out.println("Gratulálok, eltaláltad! A kincs a(z) " + kincs.getNev() + " ládában van.");
        } else {
            System.out.println("Sajnos nem talált. A(z) " + tipp.getNev() + " láda üres, a kincs a(z) "
                    + kincs.getNev() + " ládában van.");
        }
    }

    @Override
    public void megjelenitHiba(String uzenet) {
        System.out.println("Hiba: " + uzenet);
    }
}
