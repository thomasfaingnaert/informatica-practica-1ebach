package lab15;

public class Persoon {
    private String voornaam;
    private String familienaam;
    private TelefoonNummer tel;

    public Persoon(String voornaam, String familienaam, TelefoonNummer telefoonNummer) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.tel = telefoonNummer;
    }

    public Persoon(String s) {
        final int commaIndex = s.indexOf(',');
        final int colonIndex = s.indexOf(':');

        voornaam = s.substring(1, commaIndex);
        familienaam = s.substring(commaIndex + 1, colonIndex);
        tel = new TelefoonNummer(s.substring(colonIndex + 1, s.length() - 1));
    }

    public String toString() {
        return String.format("[%s,%s:%s]", voornaam, familienaam, tel);
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public TelefoonNummer getTelefoonNummer() {
        return tel;
    }
}