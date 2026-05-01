package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Model2 model = new Model2();

        System.out.print("Masukkan jumlah data (N): ");
        int N = sc.nextInt();
        sc.nextLine();

        int[] stok = new int[N];
        String[] kategori = new String[N];

        // input stok
        System.out.println("Masukkan stok barang:");
        for (int i = 0; i < N; i++) {
            System.out.print("Stok ke-" + (i+1) + ": ");
            stok[i] = sc.nextInt();
        }
        sc.nextLine();

        // input kategori
        System.out.println("Masukkan kategori tiap barang:");
        for (int i = 0; i < N; i++) {
            System.out.print("Kategori ke-" + (i+1) + ": ");
            kategori[i] = sc.nextLine();
        }

        // kategori yang ingin dicari
        System.out.print("\nMasukkan kategori yang ingin dihitung: ");
        String cariKategori = sc.nextLine();

        int total = model.hitungTotalKategori(stok, kategori, cariKategori);

        System.out.println("\n===== HASIL =====");
        System.out.println("Total stok kategori \"" + cariKategori + "\" = " + total);

        sc.close();
    }
}