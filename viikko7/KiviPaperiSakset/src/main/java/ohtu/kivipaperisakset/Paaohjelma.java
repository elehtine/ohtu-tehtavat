package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KPSFactory factory = new KPSFactory();

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            KiviPaperiSakset peli;
            if (vastaus.endsWith("a")) {
                peli = factory.luoKaksinpeli();
            } else if (vastaus.endsWith("b")) {
                peli = factory.luoTekoaly();
            } else if (vastaus.endsWith("c")) {
                peli = factory.luoPahaTekoaly();
            } else {
                break;
            }

            peli.pelaa();
        }

    }
}
