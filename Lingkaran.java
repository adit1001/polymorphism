package polymorphism;

public class Lingkaran extends BangunDatar {
    private double r;
    private  static double  pi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPi()
    {
        return pi = 3.14;
    }

    public  void setPi(double pi)
    {
        this.pi = pi;
    }

    public double hitungKeliling() {
        return 2 * pi * r;
    }

    public double hitungLuas() {
        return pi * r * r;
    }
}