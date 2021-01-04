package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class inputan2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        String nama;

        System.out.print("Masukkan nama : ");
        nama = inputan.nextLine();
        System.out.println("Nama saya adalah : "+nama);
    }
}
