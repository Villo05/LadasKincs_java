package vezerlo;

import java.util.Scanner;
import modell.Lada;
import modell.Ladak;
import nezet.Nezet;



public class LadakVezerloje {
    private Nezet nezet;
    private Ladak modell;

    public LadakVezerloje(Nezet nezet, Ladak modell) {
        this.nezet = nezet;
        this.modell = modell;

        Lada[] ladak = modell.getLadak().toArray(new Lada[0]);
        nezet.megjelenit(ladak);

        Scanner be = new Scanner(System.in);
        String sor = be.nextLine();
        try {
            int index = Integer.parseInt(sor.trim()) - 1;
            if (index < 0 || index > 2) {
                nezet.megjelenitHiba("1 és 3 közötti számot adj meg!");
            } else {
                boolean talalt = modell.tippel(index);
                nezet.megjelenitEredmeny(ladak[index], ladak[modell.getKincsIndex()], talalt);
            }
        } catch (NumberFormatException e) {
            nezet.megjelenitHiba("Számot adj meg!");
        }
    }
}