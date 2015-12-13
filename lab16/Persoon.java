package lab16;

public class Persoon {
    protected String voornaam;
    protected String familienaam;
    protected char geslacht;
    protected int geboortejaar;
    protected static int aantalVrouwen = 0;
    protected static int aantalMannen = 0;

    public Persoon(String voornaam, String familienaam, char geslacht, int geboortejaar) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.geboortejaar = geboortejaar;
        if (geslacht == 'm' || geslacht == 'v') {
            this.geslacht = geslacht;
            if (geslacht == 'm')
                aantalMannen++;
            else
                aantalVrouwen++;
        } else {
            System.out.println("Foutief geslacht !");
            geslacht = '?';
        }
    }

    public Persoon(String voornaam, String familienaam, int geboortejaar) {
        this(voornaam, familienaam, 'v', geboortejaar);
    }

    public Persoon(Persoon p) {
        this(p.voornaam, p.familienaam, p.geslacht, p.geboortejaar);
    }

    public String geefNaam() {
        return voornaam + familienaam;
    }

    public int geefLeeftijd(int jaartal) {
        return (jaartal >= geboortejaar) ? (jaartal - geboortejaar) : 0;
    }

    public static int aantalPersonen() {
        return aantalVrouwen + aantalMannen;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public char getGeslacht() {
        return geslacht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setGeslacht(char geslacht) {
        if (geslacht == 'm' || geslacht == 'v')
            this.geslacht = geslacht;
        else
            System.out.println("Foute geslachtinvoer !!!");
    }

    public String toString() {
        return voornaam + " " + familienaam + " (" + geslacht + ") geb. : "
                + geboortejaar;
    }

    public boolean heeftZelfdeFamilienaamAls(Persoon p) {
        return (familienaam.equals(p.familienaam));
    }

    static public boolean hebbenIdentiekeFamilienaam(Persoon a, Persoon b) {
        return ((a.familienaam).equals(b.familienaam));
    }
}
