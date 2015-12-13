package lab16;

public class EngDatum extends Datum {
    private static final String[] maandNamen = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    public EngDatum(int dag, int maand, int jaar) {
        super(dag, maand, jaar);
    }

    public String toString() {
        return String.format("%s %d, %d", maandNamen[maand - 1], dag, jaar);
    }

}
