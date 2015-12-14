package lab17;

import java.lang.reflect.Array;
import java.util.*;

interface LawaaiMaker {
    public String maakLawaai();
}

class Kat implements LawaaiMaker {
    public String maakLawaai() {
        return "Miao!";
    }
}

class Hond implements LawaaiMaker {
    public String maakLawaai() {
        return "Woef!";
    }
}

class Koe implements LawaaiMaker {
    public String maakLawaai() {
        return "Boe!";
    }
}

class AnimalFarm {
    private ArrayList<LawaaiMaker> dieren = new ArrayList<>();

    public AnimalFarm(int lengte) {
        for (int i = 0; i < lengte; ++i) {
            switch (i % 3) {
                case 0:
                    dieren.add(new Kat());
                    break;
                case 1:
                    dieren.add(new Hond());
                    break;
                case 2:
                    dieren.add(new Koe());
                    break;
            }
        }
    }

    public AnimalFarm(ArrayList<LawaaiMaker> dieren) {
        this.dieren = dieren;
    }

    public String lawaai() {
        StringBuilder sb = new StringBuilder();
        for (LawaaiMaker lw : dieren)
            sb.append(lw.maakLawaai());

        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<LawaaiMaker> l = new ArrayList<LawaaiMaker>();
        l.add(new Kat());
        l.add(new Kat());
        l.add(new Koe());
        l.add(new Hond());
        l.add(new Hond());
        l.add(new Hond());
        l.add(new Koe());
        AnimalFarm f1 = new AnimalFarm(10);
        AnimalFarm f2 = new AnimalFarm(l);
        System.out.println(f1.lawaai());
        System.out.println(f2.lawaai());
    }
}