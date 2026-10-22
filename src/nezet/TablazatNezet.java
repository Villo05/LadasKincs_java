
package nezet;

import modell.Lada;


public class TablazatNezet extends KonzolNezet{
    @Override
    public void megjelenit(Lada[] ladak) {
        System.out.println("Három láda közül az egyik rejti a kincset.");
        System.out.println("Mindegyik ládán van egy felirat, de csak az egyik igaz!");
        System.out.println();
        System.out.println("%-3s %-8s %-30s".formatted("SZ.", "LÁDA", "FELIRAT"));
        System.out.println("-------------------------------------------");
        for (int i = 0; i < ladak.length; i++) {
            System.out.println("%-3d %-8s %-30s".formatted(i + 1, ladak[i].getNev(), ladak[i].getFelirat()));
        }
        System.out.println();
        System.out.print("Melyik ládában van a kincs? (1-3): ");
    }
}
