package lab15;

import com.sun.corba.se.impl.encoding.BufferQueue;

import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class TelefoonBoek {
    private String titel;
    ArrayList<Persoon> personen = new ArrayList<>();

    public TelefoonBoek(String titel) {
        this.titel = titel;
    }

    public void voegToe(Persoon p) {
        personen.add(p);
    }

    public String toString() {
        return String.format("%s:%s", titel, personen.toString());
    }

    public ArrayList<Persoon> zoekVoornaam(String voornaam) {
        ArrayList<Persoon> retVal = new ArrayList<>();

        for (Persoon p : personen)
            if (p.getVoornaam().equals(voornaam))
                retVal.add(p);

        return retVal;
    }

    public ArrayList<Persoon> zoekFamilienaam(String familienaam) {
        ArrayList<Persoon> retVal = new ArrayList<>();

        for (Persoon p : personen)
            if (p.getFamilienaam().equals(familienaam))
                retVal.add(p);

        return retVal;
    }

    public void schrijf(String bestand) throws IOException {
        FileWriter fw = new FileWriter(bestand);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(titel + "\n");
        for (Persoon p : personen)
            pw.write(p.toString() + "\n");

        pw.close();
    }

    public void lees(String bestand) throws IOException {
        personen.clear();

        FileReader fr = new FileReader(bestand);
        BufferedReader br = new BufferedReader(fr);

        titel = br.readLine();

        String lijn = br.readLine();
        while (lijn != null) {
            Persoon p = new Persoon(lijn);
            personen.add(p);
            lijn = br.readLine();
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        Persoon an = new Persoon("An", "Verhaevert", new TelefoonNummer("32", "50", "345678"));
        Persoon piet = new Persoon("Piet", "Dankaert", new TelefoonNummer("32", "9", "3345566"));
        Persoon lien = new Persoon("Lien", "Verhelst", new TelefoonNummer("44", "34", "1234567"));
        Persoon koen = new Persoon("Koen", "Verhelst", new TelefoonNummer("39", "43", "9876543"));
        TelefoonBoek boek = new TelefoonBoek("Prive");
        boek.voegToe(an);
        boek.voegToe(piet);
        boek.voegToe(lien);
        boek.voegToe(koen);
        System.out.println(boek);
        System.out.println(boek.zoekVoornaam("Piet"));
        System.out.println(boek.zoekFamilienaam("Verhelst"));
        boek.schrijf("Tel.txt");
        boek.lees("Tel.txt");
        System.out.println(boek);
    }
}