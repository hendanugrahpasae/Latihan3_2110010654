package geometri;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setRadius(7.5);

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(4.0);
        persegiPanjang.setLebar(6.0);

        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();
        double luasPersegiPanjang = persegiPanjang.luas();
        double kelilingPersegiPanjang = persegiPanjang.keliling();

        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}
