package lab16;

public class Datum {
    private static int[] aantalDagen = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int minJaar = 1900;
    protected int dag;
    protected int maand;
    protected int jaar;

    private boolean isGeldig(int dag, int maand, int jaar) {
        boolean geldigeMaand = (maand > 0) && (maand < 13);
        boolean geldigeDag;
        boolean geldigJaar = (jaar > minJaar);
        if (geldigeMaand && geldigJaar) {
            geldigeDag = (dag > 0) && (dag <= aantalDagen[maand - 1]);
            return geldigeDag;
        } else
            return false;
    }

    public Datum(int dag, int maand, int jaar) {
        if (isGeldig(dag, maand, jaar)) {
            this.dag = dag;
            this.maand = maand;
            this.jaar = jaar;
            System.out.println("Constructor DATUM !");
        } else
            System.out.println("Ongeldige datum aangemaakt !!!");
    }

    public String toString() {
        return "" + dag + "/" + maand + "/" + jaar;
    }

    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }
}