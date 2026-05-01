package model;

public class Model2 {

    // fungsi menghitung total stok berdasarkan kategori tertentu
    public int hitungTotalKategori(int[] stok, String[] kategori, String cariKategori) {
        int total = 0;

        for (int i = 0; i < kategori.length; i++) {
            if (kategori[i].equalsIgnoreCase(cariKategori)) {
                total += stok[i];
            }
        }

        return total;
    }
}