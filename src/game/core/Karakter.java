package game.core;

public class Karakter {
    private String nama;
    private int stamina;
    private int posisi;
    private Karakter partner;

    public Karakter(String nama, int stamina) {
        this.nama = nama;
        this.stamina = stamina;
        this.posisi = 0;
    }

    public String getNama() { return nama; }
    public int getStamina() { return stamina; }
    public int getPosisi() { return posisi; }
    public Karakter getPartner() { return partner; }
    public void setPartner(Karakter partner) { this.partner = partner; }

    public void tambahStamina(int jumlah) { this.stamina += jumlah; }
    public void kurangiStamina(int jumlah) { this.stamina -= jumlah; }
    public void ubahPosisi(int dy) { this.posisi += dy; }

    public void aksi() {
        System.out.println(nama + " sedang bersiap.");
    }

    public String info() {
        return nama + " | stamina: " + stamina + " | posisi: " + posisi;
    }

    @Override
    public String toString() {
        return info();
    }
}
