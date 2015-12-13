package lab15;

import java.io.*;
import java.util.*;

public class Goudmijn {

    private ArrayList<int[]> data = new ArrayList<int[]>();

    public void lees(String bestandsnaam) throws IOException {
        FileReader fr = new FileReader(bestandsnaam);
        BufferedReader br = new BufferedReader(fr);

        // Lees eerste lijn
        String lijn = br.readLine();

        // Doe verder zolang er nog data is
        while (lijn != null) {
            String[] items = lijn.split("\t");
            int[] getallen = new int[items.length];
            for (int i = 0; i < items.length; ++i)
                getallen[i] = Integer.parseInt(items[i]);

            data.add(getallen);

            // Lees volgende lijn
            lijn = br.readLine();
        }

        // Sluit bestand
        br.close();
    }

    public String toString() {
        String retVal = "";

        for (int[] lijn : data) {
            for (int element : lijn) {
                retVal += element + "\t";
            }

            retVal += "\n";
        }

        return retVal;
    }

    private int getElement(int rij, int kolom) {
        return data.get(rij)[kolom];
    }

    private int aantalRijen() {
        return data.size();
    }

    private int aantalKolommen() {
        return data.get(0).length;
    }

    private boolean isInteressant(int rij, int kolom) {
        final int aantalRijen = aantalRijen();
        final int aantalKolommen = aantalKolommen();

        // Check voor rand
        if ((rij == 0) || (rij == aantalRijen - 1) ||
                (kolom == 0) || (kolom == aantalKolommen - 1))
            return false; // Randen zijn niet interessant

        final double gemiddelde = 0.25 * (
                getElement(rij - 1, kolom) + // boven
                getElement(rij + 1, kolom) + // onder
                getElement(rij, kolom - 1) + // links
                getElement(rij, kolom + 1) // rechts
        );

        return getElement(rij, kolom) > gemiddelde;
    }

    public void schrijf(String bestandsnaam) throws IOException {
        final int aantalRijen = aantalRijen();
        final int aantalKolommen = aantalKolommen();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < aantalRijen; ++i) {
            for (int j = 0; j < aantalKolommen; ++j) {
                sb.append(isInteressant(i, j) ? 'X' : '.').append('\t');
            }
            sb.append('\n');
        }

        FileWriter fw = new FileWriter(bestandsnaam);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(sb.toString());
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        Goudmijn goud = new Goudmijn();
        goud.lees("Mijn.txt");
        goud.schrijf("Kaart.txt");
        System.out.println(goud);
    }
}

