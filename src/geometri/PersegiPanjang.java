package geometri;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    
    }

    public double keliling() {
        return 2*(panjang + lebar);
    }
}
