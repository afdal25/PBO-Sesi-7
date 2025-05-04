package menu;

import util.Diskon;

public class Minuman extends MenuItem implements Diskon {
    private boolean dingin;

    public Minuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }

    public boolean isDingin() {
        return dingin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Minuman: " + getNama() + ", Harga: " + getHarga() + ", Dingin: " + dingin);
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.15;
    }
}
