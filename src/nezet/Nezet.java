
package nezet;

import modell.Lada;


public abstract class Nezet {
    public abstract void megjelenit(Lada[] ladak);

    public abstract void megjelenitEredmeny(Lada tipp, Lada kincs, boolean talalt);

    public abstract void megjelenitHiba(String uzenet);
}
