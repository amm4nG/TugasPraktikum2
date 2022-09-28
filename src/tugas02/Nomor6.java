package tugas02;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomor6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Transkip> transkip = new ArrayList<>();
        ArrayList<Double> indexPrestasi = new ArrayList<>();

        boolean run = true;
        while (run) {
            System.out.println("=================================");
            System.out.println("INPUT NILAI AKADEMIK");
            System.out.println("=================================");
            System.out.println("[1]. Semester 1");
            System.out.println("[2]. Semester 2");
            System.out.println("=================================");
            System.out.print("Pilih Semester : ");
            String pilihSemester = scan.next();

            if (pilihSemester.equals("1")) {
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.print("Jumlah Matakuliah : ");
                int jumlahMatakuliah = scan.nextInt();
                double[] jumlahSks = new double[jumlahMatakuliah];
                System.out.println("=================================");
                for (int i = 0; i < jumlahMatakuliah; i++) {
                    System.out.print("Nama Matakuliah : ");
                    String namaMatakuliah = scan.next();
                    System.out.print("Jumlah SKS      : ");
                    int sks = scan.nextInt();
                    System.out.print("Nilai Matkul    : ");
                    double nilai = scan.nextDouble();
                    int semester = 1;

                    System.out.println("=================================");
                    jumlahSks[i] = sks;
                    transkip.add(new Transkip(namaMatakuliah, sks, nilai));
                }

                double[] jumlahNilai = new double[jumlahMatakuliah];
                for (int i = 0; i < transkip.size(); i++) {
                    if (transkip.get(i).nilai >= 80 && transkip.get(i).nilai <= 100) {
                        jumlahNilai[i] = 4 * transkip.get(i).sks;
                    } else if (transkip.get(i).nilai >= 65 && transkip.get(i).nilai < 80) {
                        jumlahNilai[i] = 3 * transkip.get(i).sks;
                    } else if (transkip.get(i).nilai >= 55 && transkip.get(i).nilai < 65) {
                        jumlahNilai[i] = 2 * transkip.get(i).sks;
                    } else if (transkip.get(i).nilai < 55) {
                        jumlahNilai[i] = 0 * transkip.get(i).sks;
                    }
                }

                double nilaiTotal = 0;
                double sksTotal = 0;
                for (int i = 0; i < jumlahNilai.length; i++) {
                    nilaiTotal += jumlahNilai[i];
                    sksTotal += jumlahSks[i];
                }

                //indeks prestasi
                double ip = nilaiTotal / sksTotal;
                System.out.println("Index Prestasi : " + ip);
                //insert ip to array
                indexPrestasi.add(new Double(ip));
                System.out.println("=================================");
                System.out.println("     TRANSKIP NILAI AKADEMIK");
                System.out.println("=================================");
                System.out.println("Matakuliah\tSks\tNilai");
                System.out.println("=================================");
                for (int i = 0; i < transkip.size(); i++) {
                    System.out.println(transkip.get(i).namaMatkul + "\t\t" + transkip.get(i).sks + "\t" + transkip.get(i).nilai);
                }
                System.out.println("=================================");
                for (int i = 0; i < indexPrestasi.size(); i++) {
                    System.out.println("IPK : " + indexPrestasi.get(i));
                }

            } else if (pilihSemester.equals("2")) {
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.print("Jumlah Matakuliah : ");
                int jumlahMatakuliah = scan.nextInt();
                double[] jumlahSks2 = new double[jumlahMatakuliah];
                System.out.println("=================================");
                for (int i = 0; i < jumlahMatakuliah; i++) {
                    System.out.print("Nama Matakuliah : ");
                    String namaMatakuliah = scan.next();
                    System.out.print("Jumlah SKS      : ");
                    int sks = scan.nextInt();
                    System.out.print("Nilai Matkul    : ");
                    double nilai = scan.nextDouble();
                    int semester = 2;

                    System.out.println("=================================");
                    jumlahSks2[i] = sks;
                    transkip.add(new Transkip(namaMatakuliah, sks, nilai));
                }

                double[] jumlahNilai2 = new double[jumlahMatakuliah];
                for (int i = 0; i < transkip.size(); i++) {
                    if (transkip.get(i).nilai >= 80 && transkip.get(i).nilai <= 100) {
                        jumlahNilai2[i] = 4 * transkip.get(i).sks;
                    } else if (transkip.get(i).nilai >= 65 && transkip.get(i).nilai < 80) {
                        jumlahNilai2[i] = 3 * transkip.get(i).sks;
                    } else if (transkip.get(i).nilai >= 55 && transkip.get(i).nilai < 65) {
                        jumlahNilai2[i] = 2 * transkip.get(i).sks;
                    } else if (transkip.get(i).nilai < 55) {
                        jumlahNilai2[i] = 0 * transkip.get(i).sks;
                    }
                }

                double nilaiTotal = 0;
                double sksTotal = 0;
                for (int i = 0; i < jumlahNilai2.length; i++) {
                    nilaiTotal += jumlahNilai2[i];
                    sksTotal += jumlahSks2[i];
                }

                //indeks prestasi
                double ip2 = nilaiTotal / sksTotal;
                System.out.println("Index Prestasi : " + ip2);
                //insert ip to array
                indexPrestasi.add(new Double(ip2));
                System.out.println("=================================");
                System.out.println("     TRANSKIP NILAI AKADEMIK");
                System.out.println("=================================");
                System.out.println("Matakuliah\tSks\tNilai");
                System.out.println("=================================");
                for (int i = 0; i < transkip.size(); i++) {
                    System.out.println(transkip.get(i).namaMatkul + "\t\t" + transkip.get(i).sks + "\t" + transkip.get(i).nilai);
                }
                System.out.println("=================================");
                for (int i = 0; i < indexPrestasi.size(); i++) {
                    System.out.println("IPK : " + indexPrestasi.get(i));
                }

            }

        }
    }
}
