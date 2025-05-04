package menu;

import util.Diskon;

public class Makanan extends MenuItem implements Diskon {
    private boolean pedas;

    public Makanan(String nama, double harga, boolean pedas) {
        super(nama, harga);
        this.pedas = pedas;
    }

    public boolean isPedas() {
        return pedas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Makanan: " + getNama() + ", Harga: " + getHarga() + " Pedas: " + pedas);
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.2;
    }
}