package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

public class KPSParempiTekoaly extends KiviPaperiSakset {

    private static final Scanner scanner = new Scanner(System.in);

    private TekoalyParannettu tekoaly;

    public KPSParempiTekoaly() {
        tekoaly = new TekoalyParannettu(20);
    }

    @Override
    protected void siirronJalkeen(String ekanSiirto) {
        tekoaly.asetaSiirto(ekanSiirto);
    }

    protected String toisenSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

}
