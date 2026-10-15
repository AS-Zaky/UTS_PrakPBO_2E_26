package game.tim2;
import game.core.Karakter;
public class Karakter2 extends Karakter {
    public Karakter2(String nama) {
        super(nama);
    }
    public void lari(){
        lari (3);
    }

    public void lari (int jarak){
        System.out.println(getNama() + " Berlari kabur sejauh " + jarak + " meters");
        this.posisiX += jarak;
        ubahStamina(-5);

        if (getPartner() != null) {
            System.out.println(" -> Benang Menarik " + getPartner().getNama() + " untuk ikut berlari kedepan.");
            getPartner().lari(jarak / 2, 0);
        }
    }
    public void injakMusuh(){
        System.out.println(getNama() + " Menginjak Bayangan MusuH");
        this.posisiY += 1;

        if (getPartner() != null){
            System.out.println(" -> " + getPartner().getNama() + " Mendapatkan Boost energi dari ikatan benang!.");
            getPartner().ubahStamina(10);
        }
    }
    @Override 
    public void aksiKhusus(){
        System.out.println(getNama() + " Mengayunkan Benang Menjadi Lasso!");
    }
}
