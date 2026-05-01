package driver;

import java.util.ArrayList;
import java.util.Scanner;
import model.Model3;

class Pesanan {
    String namaMenu;
    int jumlah;
    int subtotal;
}

public class Driver3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Model3 model = new Model3();
        ArrayList<Pesanan> daftar = new ArrayList<>();

        int totalBayar = 0;

        while (true) {
            model.tampilMenu();
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();

            if (pilih == 0) break;

            if (pilih < 1 || pilih > 6) {
                System.out.println("Menu tidak tersedia!");
                continue;
            }

            System.out.print("Jumlah: ");
            int jumlah = sc.nextInt();

            Pesanan p = new Pesanan();
            p.namaMenu = model.getNamaMenu(pilih - 1);
            p.jumlah = jumlah;
            p.subtotal = jumlah * model.getHarga(pilih - 1);

            totalBayar += p.subtotal;
            daftar.add(p);

            System.out.println("Pesanan ditambahkan!\n");
        }

        // STRUK
        System.out.println("\n===== STRUK KAFETARIA =====");
        for (Pesanan p : daftar) {
            System.out.println(p.namaMenu + " x" + p.jumlah + " = Rp " + p.subtotal);
        }
        System.out.println("---------------------------");
        System.out.println("TOTAL BAYAR = Rp " + totalBayar);

        sc.close();
    }
}