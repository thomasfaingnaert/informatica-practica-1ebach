package lab17;

abstract class Personeelslid {
    protected String naam;

    public Personeelslid(String naam) {
        this.naam = naam;
    }

    public abstract double betaal();
}

class Bediende extends Personeelslid {
    protected double maandloon;

    public Bediende(String naam, double maandloon) {
        super(naam);
        this.maandloon = maandloon;
    }

    public double betaal() {
        return maandloon;
    }

    public String toString() {
        return "[" + naam + ":M=" + maandloon + "]";
    }
}

class Kaderlid extends Bediende {
    private double bonus = 0.0;

    public Kaderlid(String naam, double maandloon) {
        super(naam, maandloon);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double betaal() {
        final double retVal = maandloon + bonus;
        bonus = 0.0;
        return retVal;
    }

    public String toString() {
        return "[" + naam + ":M=" + maandloon + ":B=" + bonus + "]";
    }
}

class Freelancer extends Personeelslid {
    private double uurloon;
    private int aantalUren = 0;

    public Freelancer(String naam, double uurloon) {
        super(naam);
        this.uurloon = uurloon;
    }

    public void voegUrenToe(int uren) {
        aantalUren += uren;
    }

    public double betaal() {
        double retVal = uurloon * aantalUren;
        aantalUren = 0;
        return retVal;
    }

    public String toString() {
        return "[" + naam + ":U=" + uurloon + ":A=" + aantalUren + "]";
    }
}

public class Bedrijf {
    public static void main(String[] args) {
        Bediende b1 = new Bediende("Mark", 2800);
        Bediende b2 = new Bediende("Paul", 3000);
        Kaderlid k1 = new Kaderlid("Johan", 3500);
        k1.setBonus(1000);
        Freelancer a1 = new Freelancer("Filip", 340);
        a1.voegUrenToe(160);
        Personeelslid[] p = {b1, b2, k1, a1};
        for (Personeelslid i : p) {
            System.out.println(i + " " + i.betaal());
        }
        for (Personeelslid i : p) {
            System.out.println(i + " " + i.betaal());
        }
    }
}