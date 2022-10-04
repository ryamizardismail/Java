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
public class KonversiNilai {
    public static void main(String[] args) {
        String nama, nim, matkul, prodi;
        String grade = "";
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("====Hasil Pengolahan Data====");
        System.out.print("Masukan Nim =");
        nim = masukan.nextLine();
        System.out.print("Masukan Nama Mahasiswa =");
        nama = masukan.nextLine();
        System.out.print("Masukan kode Program Studi = ");
        prodi = masukan.nextLine();
        //== Mengambil Jurusan dari Nim
        prodi = nim.substring(3, 5);
        switch (prodi){
            case "52" :
               System.out.println("S1-TI");
               break;
            case "51" :
               System.out.println("S1-SI");
               break;
            case "31" :
               System.out.println("D3-SI");
               break;  
            default :
               System.out.println("Prodi Tidak ditemukan"); 
            }
        System.out.print("Mata Kuliah = ");
        matkul = masukan.nextLine();
        System.out.print("Masukan Nilai Angka =");
        nilai = masukan.nextInt();
         if (nilai >= 85) {
            grade = "A";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 80) {
            grade = "A-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 75) {
            grade = "B+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 70) {
            grade = "B";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 65) {
            grade = "B-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 60) {
            grade = "C+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 55) {
            grade = "C";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 50) {
            grade = "C-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 45) {
            grade = "D";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai < 54) {
            grade = "E";
            System.out.println("Grade nilai siswa : " + grade);
        } else {
            System.out.println("Inputan anda tidak sesuai !");
        }
         switch (grade) {
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "A-":
                System.out.println("Sangat Memuaskan");
                break;
            case "B+":
                System.out.println("Memuaskan");
                break;    
            case "B":
                System.out.println("Memuaskan");
                break;    
            case "B-":
                System.out.println("Memuaskan");
                break;    
            case "C+":
                System.out.println("Cukup");
                break;    
            case "C":
                System.out.println("Cukup");
                break;    
            case "C-":
                System.out.println("Cukup");
                break;    
            case "D":
                System.out.println("Kurang");
                break;    
            case "E":
                System.out.println("Sangat Kurang");
                break;    
            default:
                break;
        }
        
        
//        if (prodi.equals("52")){
//            System.out.println("S1-TI");
//        }else if (prodi.equals("51")){
//            System.out.println("S1-SI");
//        }else  if (prodi.equals("31")){
//            System.out.println("D3-SI");
//        }else {
//            System.out.println("Prodi Tidak Dikenali");
//        }
        
        }
    }

