package game.tim2;

import game.core.Karakter;

public class Karakter2 extends Karakter {
    private boolean sedangBerlari = false;

    public Karakter2(String nama) {
        this(nama, 100);
    }

    public Karakter2(String nama, int stamina) {
        super(nama, stamina);
    }

    public void lari() {
        lari(3);
    }

    public void lari(int jarak) {
        if (sedangBerlari) {
            return;
        }

        sedangBerlari = true;
        try {
            System.out.println(getNama() + " Berlari kabur sejauh " + jarak + " meters");
            ubahPosisiXY(jarak, 0);
            ubahStamina(-5);

            if (getPartner() != null && getPartner() instanceof Karakter2) {
                Karakter2 partner = (Karakter2) getPartner();
                System.out.println(" -> Benang Menarik " + partner.getNama() + " untuk ikut berlari kedepan.");
                partner.lari(jarak / 2, 0);
            }
        } finally {
            sedangBerlari = false;
        }
    }

    public void lari(int jarak, int tinggi) {
        if (sedangBerlari) {
            return;
        }

        sedangBerlari = true;
        try {
            System.out.println(getNama() + " Berlari kabur sejauh " + jarak + " meters");
            ubahPosisiXY(jarak, tinggi);
            ubahStamina(-2);

            if (getPartner() != null && getPartner() instanceof Karakter2) {
                Karakter2 partner = (Karakter2) getPartner();
                System.out.println(" -> Benang Menarik " + partner.getNama() + " untuk ikut berlari kedepan.");
                partner.lari(jarak / 2, 0);
            }
        } finally {
            sedangBerlari = false;
        }
    }

    public void injakMusuh() {
        System.out.println(getNama() + " Menginjak Bayangan MusuH");
        ubahPosisiXY(0, 1);

        if (getPartner() != null) {
            System.out.println(" -> " + getPartner().getNama() + " Mendapatkan Boost energi dari ikatan benang!.");
            getPartner().ubahStamina(10);
        }
    }

    @Override
    public void aksiKhusus() {
        System.out.println(getNama() + " Mengayunkan Benang Menjadi Lasso!");
    }
}
