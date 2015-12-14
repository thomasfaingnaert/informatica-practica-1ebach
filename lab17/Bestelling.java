package lab17;

import java.util.ArrayList;

interface Sorteerbaar {
    public boolean komtVoor(Sorteerbaar s);
}

class Sorteer {
    public static void sorteer(ArrayList<Sorteerbaar> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            for (int j = 0; j < l.size() - i - 1; j++) {
                if (l.get(j + 1).komtVoor(l.get(j))) {
                    Sorteerbaar tijdelijk;
                    tijdelijk = l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, tijdelijk);
                }
            }
        }
    }
}

class Bestelling implements Sorteerbaar {
    protected int bestelnummer;
    private String beschrijving;

    public Bestelling(int bestelnummer, String beschrijving) {
        this.bestelnummer = bestelnummer;
        this.beschrijving = beschrijving;
    }

    public String toString() {
        return String.format("[%d:%s]", bestelnummer, beschrijving);
    }

    public boolean komtVoor(Sorteerbaar bestelling) {
        return this.bestelnummer < ((Bestelling)bestelling).bestelnummer;
    }

    public static void main(String[] args) {
        Bestelling[] b = {new Bestelling(12, "A"), new Bestelling(7, "B")
                , new Bestelling(3, "C"), new Bestelling(28, "D"), new Bestelling(1, "E")};
        ArrayList l = new ArrayList();
        for (Bestelling i : b)
            l.add(i);
        System.out.println(l);
        Sorteer.sorteer(l);
        System.out.println(l);
    }
}

class DalendBestelling extends Bestelling {
    public DalendBestelling(int bestelnummer, String beschrijving) {
        super(bestelnummer, beschrijving);
    }

    public boolean komtVoor(Sorteerbaar bestelling) {
        return this.bestelnummer > ((DalendBestelling)bestelling).bestelnummer;
    }

    public static void main(String[] args) {
        Bestelling[] b = {new DalendBestelling(12, "A"), new DalendBestelling(7, "B")
                , new DalendBestelling(3, "C"), new DalendBestelling(28, "D"), new DalendBestelling(1, "E")};
        ArrayList l = new ArrayList();
        for (Bestelling i : b)
            l.add(i);
        System.out.println(l);
        Sorteer.sorteer(l);
        System.out.println(l);
    }
}
