
package ohtu.intjoukkosovellus;

public class IntJoukko {

    private static final int ALKU_KAPASITEETTI = 5;
    private static final int OLETUS_KASVATUS = 5;

    private int lisays;
    private int[] joukko;
    private int maara;

    public IntJoukko() {
        this.joukko = new int[ALKU_KAPASITEETTI];
        this.lisays = OLETUS_KASVATUS;
    }

    public IntJoukko(int kapasiteetti) {
        this.joukko = new int[kapasiteetti];
        this.lisays = OLETUS_KASVATUS;

    }
    
    public IntJoukko(int kapasiteetti, int lisays) {
        this.joukko = new int[kapasiteetti];
        this.lisays = lisays;

    }

    public boolean lisaa(int luku) {
        if (kuuluu(luku)) {
            return false;
        }
        kasvata();

        joukko[maara] = luku;
        maara++;
        return true;
    }

    private void kasvata() {
        if (maara < joukko.length) {
            return;
        }

        int[] uusi = new int[maara + lisays];
        for (int i = 0; i < maara; i++) {
            uusi[i] = joukko[i];
        }
        joukko = uusi;
    }

    public boolean kuuluu(int luku) {
        for (int i = 0; i < maara; i++) {
            if (luku == joukko[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean poista(int luku) {
        int kohta = -1;
        for (int i = 0; i < maara; i++) {
            if (luku == joukko[i]) {
                kohta = i;
                break;
            }
        }
        if (kohta == -1) {
            return false;
        }

        joukko[kohta] = joukko[maara - 1];
        joukko[maara - 1] = 0;
        maara--;
        return true;
    }

    public int mahtavuus() {
        return maara;
    }


    @Override
    public String toString() {
        if (maara == 0) {
            return "{}";
        }

        String vastaus = "{";
        for (int i = 0; i < maara - 1; i++) {
            vastaus += joukko[i] + ", ";
        }
        vastaus += joukko[maara - 1] + "}";
        return vastaus;
    }

    public int[] toIntArray() {
        int[] taulu = new int[maara];
        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = joukko[i];
        }
        return taulu;
    }
   

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko uusi = new IntJoukko();
        for (int i = 0; i < a.maara; ++i) {
            uusi.lisaa(a.joukko[i]);
        }
        for (int i = 0; i < b.maara; ++i) {
            uusi.lisaa(b.joukko[i]);
        }
        return uusi;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko uusi = new IntJoukko();
        for (int i = 0; i < a.maara; ++i) {
            for (int j = 0; j < b.maara; ++j) {
                if (a.joukko[i] == b.joukko[j]) {
                    uusi.lisaa(a.joukko[i]);
                }
            }
        }
        return uusi;

    }
    
    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        IntJoukko uusi = new IntJoukko();
        for (int i = 0; i < a.maara; ++i) {
            uusi.lisaa(a.joukko[i]);
        }
        for (int i = 0; i < b.maara; ++i) {
            uusi.poista(b.joukko[i]);
        }
        return uusi;
    }
        
}
