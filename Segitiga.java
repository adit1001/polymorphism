package polymorphism;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double panjang;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }


    public double hitungKeliling() {
        return alas + tinggi + panjang;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}