package game.tim1;

import game.core.Karakter;

public class Karakter1 extends Karakter {

    public Karakter1(String nama) {
        this(nama, 100);
    }

    public Karakter1(String nama, int stamina) {
        super(nama, stamina);
    }

    public void loncat() {
        loncat(1);
    }

    public void loncat(int tinggi) {
        ubahPosisi(tinggi);
        System.out.println(getNama() + " loncat setinggi " + tinggi + " (posisi " + getPosisi() + ")");
    }

    public void merunduk() {
        System.out.println(getNama() + " merunduk.");
    }

    @Override
    public void aksi() {
        System.out.println(getNama() + " bersiap.");
    }

    @Override
    public String info() {
        return "Karakter1[" + getNama() + ", stamina=" + getStamina() + ", posisi=" + getPosisi() + "]";
    }
}
