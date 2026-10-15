package game.tim1;

import game.tim2.Karakter2;

public class MainTim1 {
    public static void main(String[] args) {
        System.out.println("=== Game Kooperatif : Skenario Tim 1 ===");

        Karakter1 benangMerah = new Karakter1("Benang Merah");
        Karakter2 benangBiru = new Karakter2("Benang Biru");

        benangMerah.setPartner(benangBiru);
        benangBiru.setPartner(benangMerah);

        System.out.println("\n-- Misi: Lompati rintangan, lalu bantu partner menginjak musuh --");

        benangMerah.loncat();
        benangMerah.loncat(3);
        benangMerah.merunduk();

        benangBiru.injakMusuh();
        benangBiru.lari(10);

        System.out.println("\n[STATE AKHIR SKENARIO 1]");
        benangMerah.infoState();
        benangBiru.infoState();
    }
}
