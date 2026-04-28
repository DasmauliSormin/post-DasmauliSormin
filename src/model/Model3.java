<<<<<<< HEAD
=======
package model;
//dasmauli sormin
//12S24007

public class Model3 {
    private String namaMenu;
    private int harga;
    private int jumlah;

    public Model3(String namaMenu, int harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = 0;
    }

    public Model3(String namaMenu, int harga, int jumlah) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNamaMenu() { return namaMenu; }
    public int getHarga() { return harga; }
    public int getJumlah() { return jumlah; }
    public int getSubtotal() { return harga * jumlah; }
}
>>>>>>> 892cc3a59139f1a509fc2aef01c5766e8afb037a
