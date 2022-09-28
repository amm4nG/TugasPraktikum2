package tugas02;

import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("Luas Dan Keliling Bangun Datar");
        System.out.println("==============================");
        System.out.println("[1]. Persegi");
        System.out.println("[2]. Persegi Panjang");
        System.out.println("[3]. Segitiga");
        System.out.println("[4]. Lingkaran");
        System.out.println("[5]. Trapesium");
        System.out.println("[6]. Jajar Genjang");
        System.out.println("[7]. Belah Ketupat");
        System.out.println("[8]. Layang Layang");
        System.out.println("==============================");
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih Menu : ");
        int opsi = scan.nextInt();

        if (opsi == 1) {
            System.out.println("==============================");
            System.out.print("panjang sisi : ");
            double sisi = scan.nextDouble();

            System.out.println("==============================");
            System.out.println("L : " + Math.pow(sisi, 2));
            System.out.println("K : " + sisi * 4);
        } else if (opsi == 2) {
            System.out.println("==============================");
            System.out.print("panjang = ");
            double panjang = scan.nextDouble();
            System.out.print("lebar   = ");
            double lebar = scan.nextDouble();

            System.out.println("==============================");
            System.out.println("L : " + panjang * lebar);
            System.out.println("K : " + (2 * panjang + 2 * lebar));
        } else if (opsi == 3) {
            System.out.println("==============================");
            System.out.print("alas   = ");
            double alas = scan.nextDouble();
            System.out.print("tinggi = ");
            double tinggi = scan.nextDouble();

            System.out.println("L : " + alas * tinggi / 2);

            //karena disini yang diketahui cuma alas dan tingginya maka kita harus mencari panjang sisinya
            double sisi = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
            System.out.println("K : " + (alas + tinggi + sisi));
        } else if (opsi == 4) {
            System.out.println("==============================");
            System.out.print("panjang jari jari = ");
            double r = scan.nextDouble();

            double phi = 3.14;

            System.out.println("L : " + phi * Math.pow(r, 2));
            System.out.println("K : " + 2 * phi * r);
        } else if (opsi == 5) {
            System.out.println("==============================");
            System.out.print("tinggi = ");
            double tinggi = scan.nextDouble();
            System.out.print("sisiA = ");
            double sisiA = scan.nextDouble();
            System.out.print("sisiB = ");
            double sisiB = scan.nextDouble();
            System.out.print("sisiC = ");
            double sisiC = scan.nextDouble();
            System.out.print("sisiD = ");
            double sisiD = scan.nextDouble();

            System.out.println("L : " + tinggi / 2 * (sisiA + sisiB));
            System.out.println("K : " + (sisiA + sisiB + sisiC + sisiD));
        } else if (opsi == 6) {
            System.out.println("==============================");
            System.out.print("alas   = ");
            double alas = scan.nextDouble();
            System.out.print("tinggi = ");
            double tinggi = scan.nextDouble();
            System.out.print("sisi miring = ");
            double sisiMiring = scan.nextDouble();

            System.out.println("L : " + alas * tinggi);
            System.out.println("K : " + 2 * (alas + sisiMiring));
        } else if (opsi == 7) {
            System.out.println("==============================");
            System.out.print("diagonal 1 = ");
            double diagonal1 = scan.nextDouble();
            System.out.print("diagonal 2 = ");
            double diagonal2 = scan.nextDouble();
            System.out.print("sisi       = ");
            double sisi = scan.nextDouble();

            System.out.println("L : " + diagonal1 * diagonal2 / 2);
            System.out.println("K : " + sisi * 4);
        } else if (opsi == 8) {
            System.out.println("==============================");
            System.out.print("diagonal 1 = ");
            double d1 = scan.nextDouble();
            System.out.print("diagonal 2 = ");
            double d2 = scan.nextDouble();
            System.out.print("sisi 1     = ");
            double s1 = scan.nextDouble();
            System.out.print("sisi 2     = ");
            double s2 = scan.nextDouble();
            System.out.print("sisi 3     = ");
            double s3 = scan.nextDouble();
            System.out.print("sisi 4     = ");
            double s4 = scan.nextDouble();

            System.out.println("L : " + d1 * d2 / 2);
            System.out.println("K : " + (s1 + s2 + s3 + s4));
        }
    }

}
