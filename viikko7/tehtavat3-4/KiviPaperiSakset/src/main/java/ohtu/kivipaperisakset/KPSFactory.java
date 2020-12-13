package ohtu.kivipaperisakset;

public class KPSFactory {

    public KiviPaperiSakset luoKaksinpeli() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        KPSPelaajaVsPelaaja kaksinpeli = new KPSPelaajaVsPelaaja();
        return kaksinpeli;
    }

    public KiviPaperiSakset luoTekoaly() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        KPSTekoaly yksinpeli = new KPSTekoaly();
        return yksinpeli;
    }

    public KiviPaperiSakset luoPahaTekoaly() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        KPSParempiTekoaly pahaYksinpeli = new KPSParempiTekoaly();
        return pahaYksinpeli;
    }


}

