package game.core;

public class Karakter {
    private String nama;
    private int stamina;
    private int posisi;
    private int posisiX;
    private int posisiY;
    private Karakter partner;

    public Karakter(String nama) {
        this(nama, 100);
    }

    public Karakter(String nama, int stamina) {
        this.nama = nama;
        this.stamina = stamina;
        this.posisi = 0;
        this.posisiX = 0;
        this.posisiY = 0;
    }

    public String getNama() { return nama; }
    public int getStamina() { return stamina; }
    public int getPosisi() { return posisi; }
    public int getPosisiX() { return posisiX; }
    public int getPosisiY() { return posisiY; }
    public Karakter getPartner() { return partner; }
    public void setPartner(Karakter partner) { this.partner = partner; }

    public void tambahStamina(int jumlah) { this.stamina += jumlah; }
    public void kurangiStamina(int jumlah) { this.stamina -= jumlah; }
    public void ubahStamina(int jumlah) { this.stamina += jumlah; }
    public void ubahPosisi(int dy) { this.posisi += dy; this.posisiX += dy; }
    public void ubahPosisiXY(int dx, int dy) {
        this.posisiX += dx;
        this.posisiY += dy;
        this.posisi = this.posisiX + this.posisiY;
    }

    public void aksi() {
        System.out.println(nama + " sedang bersiap.");
    }

    public void aksiKhusus() {
        System.out.println(nama + " menggunakan aksi khusus.");
    }

    public void infoState() {
        System.out.println(nama + " | stamina: " + stamina + " | posisiX: " + posisiX + " | posisiY: " + posisiY);
    }

    public String info() {
        return nama + " | stamina: " + stamina + " | posisi: " + posisi;
    }

    @Override
    public String toString() {
        return info();
    }
}
