package lab16;

public class Voertuig {
    protected String merk;
    protected String serienummer;

    public Voertuig(String merk, String serienummer) {
        this.merk = merk;
        this.serienummer = serienummer;
    }

    public String toString() {
        return String.format("[%s:%s]", merk, serienummer);
    }
}
