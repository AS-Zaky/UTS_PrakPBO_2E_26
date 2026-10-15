package game.tim2;

import game.tim1.Karakter1;

public class MainTim2 {
    public static void main(String[] args) {
      System.out.println("=== Game Kooperatif : Skenario Tim 2 ===");

      Karakter1 BenangMerah = new Karakter1("Benang Merah");
      Karakter2 BenangBiru = new Karakter2("Benang Biru");

      BenangMerah.setPartner(BenangBiru);
      BenangBiru.setPartner(BenangMerah);
    
      System.out.println("\n-- Misi: Mengalahkan burung dan berlari dari kejaran --");
        
        // Skenario Kooperatif: 3 kali injak musuh, lalu lari
        BenangBiru.injakMusuh();
        BenangBiru.injakMusuh();
        BenangBiru.injakMusuh();
        BenangBiru.lari(10); // Lari cepat (Overloading)
        
        System.out.println("\n[STATE AKHIR SKENARIO 2]");
        BenangMerah.infoState(); // Terlihat stamina Yarny merah bertambah karena boost dari injakan Yarny Biru
        BenangBiru.infoState();
    }
}
