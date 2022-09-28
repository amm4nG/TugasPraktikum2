/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas02;

import java.util.Scanner;

/**
 *
 * @author ARMAN
 */
public class Nomor5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] minMax = new int[5];
        
        System.out.print("a : ");
        int a = scan.nextInt();
        minMax[0] = a;
        System.out.print("b : ");
        int b = scan.nextInt();
        minMax[1] = b;
        System.out.print("c : ");
        int c = scan.nextInt();
        minMax[2] = c;
        System.out.print("d : ");
        int d = scan.nextInt();
        minMax[3] = d;
        System.out.print("e : ");
        int e = scan.nextInt();
        minMax[4] = e;

        int min = minMax[0];
        int max = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (minMax[i] < min) {
                min = minMax[i];
            }else if (minMax[i] > max) {
                max = minMax[i];
            }
        }
        System.out.println("Min = "+min+", Max = "+max);
    }
}
