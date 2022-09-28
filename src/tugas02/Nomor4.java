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
public class Nomor4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a : ");
        int a = scan.nextInt();
        System.out.print("b : ");
        int b = scan.nextInt();

        if (a < b) {
            System.out.println("min = " + a + ", max = " + b);
        } else {
            System.out.println("min = " + b + ", max = " + a);
        }
    }
}
