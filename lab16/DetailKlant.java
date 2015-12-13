package lab16;

public class DetailKlant extends Klant {
    public DetailKlant(String naam) {
        super(naam);
    }

    private double goedkoopsteItem() {
        if (aankoopbedragen.size() == 0)
            return 0.0;

        double goedkoopste = aankoopbedragen.get(0);

        for (double aankoop : aankoopbedragen) {
            if (aankoop < goedkoopste)
                goedkoopste = aankoop;
        }

        return goedkoopste;
    }

    public double getTotaal() {
        return super.getTotaal() - goedkoopsteItem();
    }

    public static void main(String[] args){
        double[] aankopen={100.0,150.0,30.0,27.0};
        DetailKlant annemie=new DetailKlant("Annemie");
        for(double d:aankopen)
            annemie.koop(d);
        System.out.println("Te betalen :"+annemie.getTotaal());

    }
}