package com.company;

import java.util.Scanner;

public class postest1 {
    public static void main(String[] args) {
        Scanner input_nama =  new Scanner(System.in);
        String nama;
        System.out.print("Masukkan Nama Anda : ");
        nama = input_nama.nextLine();

        Scanner input_nilai =  new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan Nilai Anda : ");
        nilai = input_nilai.nextInt();

        System.out.println("Nama Anda : "+ nama);
        if(nilai>80 && nilai<=100){
            System.out.println("Nilai Anda : A");
        }
        else if(nilai>70 && nilai<=80){
            System.out.println("Nilai Anda : B");
        }
        else if(nilai>60 && nilai<=70){
            System.out.println("Nilai Anda : C");
        }
        else if(nilai>50 && nilai<=60){
            System.out.println("Nilai Anda : D");
        }
        else if(nilai>=0 && nilai<=50){
            System.out.println("Nilai Anda : E");
        }
        else{
            System.out.println("Nilai yang anda masukkan salah (Tidak memiliki Grade)");
        }
    }
}
