package polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");

        int choice = scanner.nextInt();

        BangunDatar bangunDatar = null;

        switch (choice) {
            case 1:
                bangunDatar = new Persegi();
                break;
            case 2:
                bangunDatar = new Lingkaran();
                break;
            case 3:
                bangunDatar = new PersegiPanjang();
                break;
            case 4:
                bangunDatar = new Segitiga();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        System.out.println("Masukkan nilai sisi/panjang/lebar/alas/tinggi:");
        double nilai = scanner.nextDouble();

        if (bangunDatar instanceof Persegi) {
            ((Persegi) bangunDatar).setSisi(nilai);
        } else if (bangunDatar instanceof Lingkaran) {
            ((Lingkaran) bangunDatar).setR(nilai);
        } else if (bangunDatar instanceof PersegiPanjang) {
            ((PersegiPanjang) bangunDatar).setPanjang(nilai);
            System.out.println("Masukkan nilai lebar:");
            double lebar = scanner.nextDouble();
            ((PersegiPanjang) bangunDatar).setLebar(lebar);
        } else if (bangunDatar instanceof Segitiga) {
            ((Segitiga) bangunDatar).setAlas(nilai);
            System.out.println("Masukkan nilai tinggi:");
            double tinggi = scanner.nextDouble();
            ((Segitiga) bangunDatar).setTinggi(tinggi);
            System.out.println("Masukan nilai panjang: ");
            double panjang = scanner.nextDouble();
            ((Segitiga) bangunDatar).setPanjang(panjang);
        }

        System.out.println("Keliling: " + bangunDatar.hitungKeliling());
        System.out.println("Luas: " + bangunDatar.hitungLuas());
    }
}
