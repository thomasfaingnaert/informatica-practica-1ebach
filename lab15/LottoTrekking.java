package lab15;

import java.util.*;
import java.io.*;

public class LottoTrekking {
    int aantalRegels, aantalKolommen, aantalAangekruisd;
    int[] winnendeCijfers;
    ArrayList<LottoFormulier> formulieren = new ArrayList<>();

    public LottoTrekking(int aantalRegels, int aantalKolommen, int aantalAangekruisd, int[] winnendeCijfers) {
        this.aantalRegels = aantalRegels;
        this.aantalKolommen = aantalKolommen;
        this.aantalAangekruisd = aantalAangekruisd;
        this.winnendeCijfers = winnendeCijfers;
    }

    public void leesFormulieren(String[] bestanden) throws IOException {
        for (String bestand : bestanden) {
            LottoFormulier form = LottoFormulier.lees(bestand);
            formulieren.add(form);
        }
    }

    private boolean isWinnaar(LottoFormulier form) {
        int[] aangekruisd = form.getGetallen();
        boolean isJuist = true;

        for (int i = 0; i < form.getAantal(); ++i) {
            boolean gevonden = false;
            for (int j = 0; j < winnendeCijfers.length; ++j) {
                if (aangekruisd[i] == winnendeCijfers[j]) {
                    gevonden = true;
                    break;
                }
            }

            if (!gevonden)
                return false;
        }

        return true;
    }

    public ArrayList<LottoFormulier> winnaars() {
        ArrayList<LottoFormulier> retVal = new ArrayList<>();

        for (LottoFormulier form : formulieren) {
            if (isWinnaar(form))
                retVal.add(form);
        }

        return retVal;
    }

    public static void main(String[] args) throws IOException {
        LottoFormulier an = new LottoFormulier("An", 9, 5, 6);
        an.vulIn(new int[]{2, 4, 6, 8, 9, 44});
        LottoFormulier jan = new LottoFormulier("Jan", 9, 5, 6);
        jan.vulIn(new int[]{2, 5, 6, 8, 9, 45});
        LottoFormulier lotte = new LottoFormulier("Lotte", 9, 5, 6);
        lotte.vulIn(new int[]{1, 2, 3, 4, 5, 6});
        LottoFormulier piet = new LottoFormulier("Piet", 9, 5, 6);
        piet.vulIn(new int[]{40, 41, 42, 43, 44, 45});
        LottoFormulier pieter = new LottoFormulier("Pieter", 9, 5, 6);
        pieter.vulIn(new int[]{2, 4, 6, 8, 9, 44});
        an.schrijf("FormAn.txt");
        jan.schrijf("FormJan.txt");
        piet.schrijf("FormPiet.txt");
        lotte.schrijf("FormLotte.txt");
        pieter.schrijf("FormPieter.txt");
        LottoTrekking t = new LottoTrekking(9, 5, 6, new int[]{2, 4, 6, 8, 9, 44});
        t.leesFormulieren(new String[]{"FormAn.txt", "FormJan.txt", "FormPiet.txt", "FormLotte.txt", "FormPieter.txt"});
        ArrayList<LottoFormulier> winnaars = t.winnaars();
        System.out.println(winnaars);
    }
}