package lab16;

public class NedDatum extends Datum {
    private static final String[] maandNamen = {
            "januari",
            "februari",
            "maart",
            "april",
            "mei",
            "juni",
            "juli",
            "augustus",
            "september",
            "oktober",
            "november",
            "december"
    };

    public NedDatum(int dag, int maand, int jaar) {
        super(dag, maand, jaar);
    }

    public String toString() {
        return String.format("%d %s %d", dag, maandNamen[maand - 1], jaar);
    }
}
