/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ARMAN
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Transkip> transkip = new ArrayList<>();
        ArrayList<Double> jumlahNilai = new ArrayList<>();

        System.out.println("=================================");
        System.out.println("INPUT NILAI AKADEMIK");
        System.out.println("=================================");

        System.out.print("Jumlah Semester : ");
        int jumlahSemester = scan.nextInt();
        System.out.println("=================================");
        for (int i = 1; i <= jumlahSemester; i++) {
            System.out.print("Jumlah Matakuliah Semester " + i + " : ");
            int jumlahMatakuliah = scan.nextInt();
            System.out.println("=================================");
            for (int j = 0; j < jumlahMatakuliah; j++) {

                System.out.print("Nama Matakuliah : ");
                String namaMatakuliah = scan.next();

                System.out.print("Sks             : ");
                int sks = scan.nextInt();

                System.out.print("Nilai           : ");
                double nilai = scan.nextDouble();

                transkip.add(new Transkip(namaMatakuliah, sks, nilai));
                if (nilai >= 80 && nilai <= 100) {
                    jumlahNilai.add(new Double(4 * sks));
                } else if (nilai >= 65 && nilai < 80) {
                    jumlahNilai.add(new Double(3 * sks));
                } else if (nilai >= 55 && nilai < 65) {
                    jumlahNilai.add(new Double(2 * sks));
                } else if (nilai < 55) {
                    jumlahNilai.add(new Double(0 * sks));
                }
            }
            System.out.println("=================================");
        }
        System.out.println("=================================");
        System.out.println("     TRANSKIP NILAI AKADEMIK");
        System.out.println("=================================");
        System.out.println("Matakuliah\tSks\tNilai");
        System.out.println("=================================");
        for (int i = 0; i < transkip.size(); i++) {
            System.out.println(transkip.get(i).namaMatkul + "\t\t" + transkip.get(i).sks + "\t" + transkip.get(i).nilai);
        }
        System.out.println("=================================");
        
        double sumNilai = 0;
        double sumSks = 0;
        for (int i = 0; i < jumlahNilai.size(); i++) {
            sumNilai += jumlahNilai.get(i);
            sumSks += transkip.get(i).sks;
        }
        System.out.println("Ip : "+sumNilai/sumSks);
    }
}
