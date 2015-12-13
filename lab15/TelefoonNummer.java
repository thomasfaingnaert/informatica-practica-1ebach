package lab15;

public class TelefoonNummer {
    private String land, zone, abonnee;

    public TelefoonNummer(String land, String zone, String abonnee) {
        this.land = land;
        this.zone = zone;
        this.abonnee = abonnee;
    }

    public TelefoonNummer(String str) {
        String[] delen = str.split("/");
        land = delen[0];
        zone = delen[1];
        abonnee = delen[2];
    }

    public String toString() {
        return String.format("%s/%s/%s", land, zone, abonnee);
    }
}