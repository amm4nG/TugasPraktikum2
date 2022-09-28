package tugas02;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Volume Aliran  : ");
        double v = scan.nextDouble();
        System.out.print("Waktu Aliran : ");
        double w = scan.nextDouble();
        
        System.out.println("Debit : "+ v/w+"m^3/s");
    }
}
