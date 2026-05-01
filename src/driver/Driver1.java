package driver;

import java.util.ArrayList;
import java.util.Scanner;
import model.Model1;

class Pengiriman {
    String kota;
    double beratButet;
    double beratUcok;
    double totalBerat;
    double totalBiaya;
    String promo;
}

public class Driver1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Model1 model = new Model1();
        ArrayList<Pengiriman> daftar = new ArrayList<>();

        while (true) {
            String kodeKota = sc.nextLine();

            if (kodeKota.equalsIgnoreCase("END")) {
                break;
            }

            double beratButet = sc.nextDouble();
            sc.nextLine();

            if (!model.cekKodeKota(kodeKota)) {
                System.out.println("Kode kota tidak tersedia!");
                continue;
            }

            Pengiriman p = new Pengiriman();
            p.kota = kodeKota;
            p.beratButet = beratButet;

            p.beratUcok = model.hitungBeratUcok(beratButet);
            p.totalBerat = model.hitungTotalBerat(beratButet);

            int tarif = model.getTarif(kodeKota);
            double biayaDasar = model.hitungBiaya(p.totalBerat, tarif);
            double diskon = model.hitungDiskon(p.totalBerat, biayaDasar);
            p.totalBiaya = biayaDasar - diskon;

            String promo = "";
            if (diskon > 0) promo += "Diskon 10% ";
            if (model.cekAsuransiGratis(kodeKota)) promo += "Asuransi Gratis";
            if (promo.equals("")) promo = "Tidak ada promo";
            p.promo = promo;

            daftar.add(p);
        }

        System.out.println("\n===== STRUK PEMBAYARAN DEL EXPRESS =====");
        for (Pengiriman p : daftar) {
            System.out.println("Kota Tujuan        : " + p.kota);
            System.out.println("Berat Butet        : " + p.beratButet + " kg");
            System.out.println("Berat Ucok         : " + p.beratUcok + " kg");
            System.out.println("Total Berat        : " + p.totalBerat + " kg");
            System.out.println("Total Ongkir       : Rp " + (int)p.totalBiaya);
            System.out.println("Promo              : " + p.promo);
            System.out.println("----------------------------------------");
        }

        sc.close();
    }
}