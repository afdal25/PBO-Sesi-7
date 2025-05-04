package app;

import menu.*;
import util.Diskon;
import java.util.ArrayList;

public class MinangRaya {
    public static void main(String[] args) {
        ArrayList<MenuItem> daftarMenu = new ArrayList<>();

        MenuItem m1 = new Makanan("Ayam Goreng", 17000, true);
        MenuItem m2 = new Minuman("Es Teh", 8000, true);
        MenuItem m3 = new Makanan("Ayam Bakar", 17000, false);

        daftarMenu.add(m1);
        daftarMenu.add(m2);
        daftarMenu.add(m3);

        for (MenuItem item : daftarMenu) {
            item.tampilkanInfo();
            if (item instanceof Diskon) {
                System.out.println("Diskon: " + ((Diskon) item).hitungDiskon());
            }
            System.out.println("------------");
        }
    }
}
