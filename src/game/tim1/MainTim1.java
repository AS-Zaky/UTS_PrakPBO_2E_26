package game.tim1;

public class MainTim1 {
    public static void main(String[] args) {
        Karakter1 k1 = new Karakter1("Zaky", 100);

        k1.loncat();
        k1.loncat(3);
        k1.merunduk();
        k1.aksi();

        System.out.println(k1);
    }
}
