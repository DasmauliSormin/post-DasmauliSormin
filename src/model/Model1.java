package model;

public class Model1 {

    String[] kodeKota = {"MDN", "BLG", "JKT", "SBY"};
    int[] tarifKota   = {10000, 12000, 15000, 16000};

    public boolean cekKodeKota(String kode) {
        for (int i = 0; i < kodeKota.length; i++) {
            if (kodeKota[i].equalsIgnoreCase(kode)) {
                return true;
            }
        }
        return false;
    }

    public int getTarif(String kode) {
        for (int i = 0; i < kodeKota.length; i++) {
            if (kodeKota[i].equalsIgnoreCase(kode)) {
                return tarifKota[i];
            }
        }
        return 0;
    }

    public double hitungBeratUcok(double beratButet) {
        return 1.5 * beratButet;
    }

    public double hitungTotalBerat(double beratButet) {
        return beratButet + hitungBeratUcok(beratButet);
    }

    public double hitungBiaya(double totalBerat, int tarif) {
        return totalBerat * tarif;
    }

    public double hitungDiskon(double totalBerat, double biaya) {
        if (totalBerat > 10) {
            return biaya * 0.10;
        }
        return 0;
    }

    public boolean cekAsuransiGratis(String kodeKota) {
        return kodeKota.equalsIgnoreCase("JKT") || kodeKota.equalsIgnoreCase("SBY");
    }
}