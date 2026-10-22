package modell;


public class Lada {
    private final  String nev;
    private final  String felirat;

    public Lada(String nev, String felirat) {
        this.nev = nev;
        this.felirat = felirat;
    }

    public String getNev() {
        return nev;
    }

    public String getFelirat() {
        return felirat;
    }

    @Override
    public String toString() {
        return "Lada{" + "nev=" + nev + ", felirat=" + felirat + '}';
    }
}
