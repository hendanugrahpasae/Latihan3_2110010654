package geometri;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(5.8);
        
        // Menghitung luas dan keliling Lingkaran
        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();
        
        // Menampilkan hasil
        System.out.println("Lingkaran:");
        System.out.println("Luas: " + luasLingkaran);
        System.out.println("Keliling: " + kelilingLingkaran);

        System.out.println();

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        
        // Menghitung luas dan keliling PersegiPanjang
        double luasPersegiPanjang = persegiPanjang.luas();
        double kelilingPersegiPanjang = persegiPanjang.keliling();
        
        // Menampilkan hasil
        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);
    }
}