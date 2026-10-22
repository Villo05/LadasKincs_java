package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public final class Ladak {
    private final ArrayList<Lada> ladak;
    private final int kincsIndex;

    public Ladak() {
        ladak = new ArrayList<>();
        felvesz(new Lada("arany", "Én rejtem a kincset."));
        felvesz(new Lada("ezüst", "Nem én rejtem a kincset."));
        felvesz(new Lada("bronz", "Az arany hazudik."));

        kincsIndex = megoldas();
    }

    public void felvesz(Lada lada) {
        ladak.add(lada);
    }

    public List<Lada> getLadak() {
        return Collections.unmodifiableList(ladak);
    }

    public int getKincsIndex() {
        return kincsIndex;
    }


    public boolean feliratIgaz(int lada, int kincs) {
        return switch (lada) {
            case 0 -> kincs == 0;
            case 1 -> kincs != 1;
            default -> !feliratIgaz(0, kincs);
        };
    }

    private int megoldas() {
        for (int kincs = 0; kincs < 3; kincs++) {
            int igazak = 0;
            for (int lada = 0; lada < 3; lada++) {
                if (feliratIgaz(lada, kincs)) {
                    igazak++;
                }
            }
            if (igazak == 1) {
                return kincs;
            }
        }
        return -1;
    }

    public boolean tippel(int index) {
        return index == kincsIndex;
    }
}
