package lab15;

import java.io.*;
import java.util.ArrayList;

public class LottoFormulier {
    private String klant;
    private int m, n, aantal;
    private int[] ingevuld;

    public LottoFormulier(String klant, int m, int n, int aantal) {
        this.klant = klant;
        this.m = m;
        this.n = n;
        this.aantal = aantal;
    }

    public void vulIn(int[] aangekruisd) {
        if (aangekruisd.length != aantal)
            return;

        ingevuld = new int[aangekruisd.length];
        System.arraycopy(aangekruisd, 0, ingevuld, 0, aangekruisd.length);
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int getAantal() {
        return aantal;
    }

    public int[] getGetallen() {
        return ingevuld;
    }

    private static int[] convert(ArrayList<Integer> list) {
        int[] retVal = new int[list.size()];

        for (int i = 0; i < list.size(); ++i)
            retVal[i] = list.get(i).intValue();

        return retVal;
    }

    public static LottoFormulier lees(String bestand) throws IOException {
        FileReader fr = new FileReader(bestand);
        BufferedReader br = new BufferedReader(fr);

        final String naam = br.readLine();
        final int m = Integer.parseInt(br.readLine());
        final int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> ingevuld = new ArrayList<>();

        for (int i = 0; i < m; ++i) {
            String[] items = br.readLine().split("\t");

            for (int j = 0; j < n; ++j) {
                if (items[j].equals("X"))
                    ingevuld.add(i * n + j + 1);
            }
        }
        br.close();

        LottoFormulier lt = new LottoFormulier(naam, m, n, ingevuld.size());
        lt.vulIn(convert(ingevuld));
        return lt;
    }

    public String toString() {
        String s = String.format("[%s,%d,%d,%d][", klant, m, n, aantal);
        StringBuilder sb = new StringBuilder(s);

        String delimiter = "";
        for (int n : ingevuld) {
            sb.append(delimiter).append(n);
            delimiter = ", ";
        }

        sb.append(']');

        return sb.toString();
    }

    private boolean isAangekruisd(int n) {
        for (int el : ingevuld) {
            if (el == n)
                return true;
        }

        return false;
    }

    public void schrijf(String bestand) throws IOException {
        FileWriter fw = new FileWriter(bestand);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(klant + "\n");
        pw.write(m + "\n");
        pw.write(n + "\n");

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int getal = i * n + j + 1;
                if (isAangekruisd(getal))
                    pw.write("X");
                else
                    pw.write(Integer.toString(getal));
                pw.write('\t');
            }
            pw.write('\n');
        }

        pw.close();
    }

}
