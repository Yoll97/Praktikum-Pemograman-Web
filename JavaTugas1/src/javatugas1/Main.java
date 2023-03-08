/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatugas1;

import java.util.Scanner;
/**
 *
 * @author Windows
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r, p, l, k, v, t, luasPermukaan;
        double PI = 3.14;
        int pil;
        char ulang;
        
        do {
            System.out.println("===================");
            System.out.println("     MENU UTAMA    ");
            System.out.println("===================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            
            switch(pil){
                case 1 :
                        System.out.println(" Input panjang : ");
                        p = input.nextInt();
                        System.out.println(" Input lebar : ");
                        l = input.nextInt();
                        System.out.println(" Input tinggi : ");
                        t = input.nextInt();
        
                        l = p * l;
                        k = 2 * (p + l);
                        v = p * l * t;
                        luasPermukaan = 2 * (p * l + l * t + p * t);
        
                        System.out.println("Luas persegi panjang = " + l);
                        System.out.println("Keliling persegi panjang = " + k);
                        System.out.println("Volume balok = " + v);
                        System.out.println("Luas permukaan balok = " + luasPermukaan);
                break;
                case 2 :
                        System.out.println(" Input tinggi = ");
                        t = input.nextInt();1
                        System.out.println(" Input jari jari = ");
                        r = input.nextInt();
        
                        l = PI * r * r;
                        k = 2 * PI *r;
                        v = (PI * r * r) * t;
                        luasPermukaan = PI * r * (r +  t);
        
                        System.out.println("Luas lingkaran = " + l);
                        System.out.println("Keliling lingkaran = " + k);
                        System.out.println("Volume tabung : " + v);
                        System.out.println("Luas permukaan tabung = " + luasPermukaan);
                break;
                case 3 :
                    System.exit(0);
                break;
                default :
                    System.out.println("Telah keluar"); 
            }
            System.out.print("Ulang? (y/t) ");
            ulang = input.next().charAt(0);
            
            System.out.println();
        }
        while (ulang!= 't');
    }
}