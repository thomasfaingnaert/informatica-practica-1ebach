package lab16;

public class Groothandelaar extends Klant {
    private double korting = 0.10;

    public Groothandelaar(String naam) {
        super(naam);
    }

    public Groothandelaar(String naam, double korting) {
        super(naam);
        this.korting = korting;
    }

    public double getTotaal() {
        return super.getTotaal() * (1 - korting);
    }

    public static void main(String[] args) {
        double[] aankopen = {100.0, 150.0, 30.0, 27.0};
        Groothandelaar paul = new Groothandelaar("Paul");
        for (double d : aankopen)
            paul.koop(d);
        System.out.println("Te betalen :" + paul.getTotaal());

    }
}