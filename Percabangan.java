/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmail;

import java.util.Scanner;

/**
 *
 * @author Hafiz Nafi'uddin
 */
public class Percabangan {
     public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Angka =");
        int angka = masukan.nextInt();
        if (angka%2==0){
            System.out.println("Angka "+ angka + " bilangan");
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Angka "+ angka + " bilangan");
            System.out.println("Bilangan Ganjil");
        }
        String hasil = angka%2==0 ? "Bilangan Genap":"Bilangan Ganjil";
        System.out.println(hasil);
    }
}
