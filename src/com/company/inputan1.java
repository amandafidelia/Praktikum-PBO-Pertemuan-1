package com.company;

import java.util.Scanner;

public class inputan1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        int angka1,angka2;

        System.out.print("Masukkan angka 1 : ");
        angka1 = inputan.nextInt();
        System.out.print("Masukkan angka 2 : ");
        angka2 = inputan.nextInt();

        System.out.println("Perkalian angka1 dan angka2 : "+ (angka1 * angka2));
    }
}
