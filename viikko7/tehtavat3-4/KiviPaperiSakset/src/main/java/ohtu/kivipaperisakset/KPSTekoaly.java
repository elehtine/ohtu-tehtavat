package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KiviPaperiSakset {

    private static final Scanner scanner = new Scanner(System.in);
    
    private Tekoaly tekoaly;

    public KPSTekoaly() {
        tekoaly = new Tekoaly();
    }

    @Override
    protected void siirronJalkeen(String ekanSiirto) {
        tekoaly.asetaSiirto(ekanSiirto);
    }

    protected String toisenSiirto() {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        return siirto;
    }

}
