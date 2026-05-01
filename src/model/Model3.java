package model;

public class Model3 {

    String[] menu = {
        "Ayam Geprek",
        "Nasi Goreng",
        "Bihun Goreng",
        "Mie Goreng",
        "Es Teh",
        "Air Mineral"
    };

    int[] harga = {
        15000,
        14000,
        13000,
        13000,
        5000,
        4000
    };

    public void tampilMenu() {
        System.out.println("===== MENU KAFETARIA IT DEL =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("0. Selesai Pesan");
    }

    public int getHarga(int index) {
        return harga[index];
    }

    public String getNamaMenu(int index) {
        return menu[index];
    }
}