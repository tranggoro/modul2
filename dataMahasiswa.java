/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author trian
 */
import java.util.Scanner;
public class dataMahasiswa {
    public static void main (String[] args){
        //deklarasi
        String nama,nim,prodi,alamat;
        
        //Inputtan
        Scanner input = new Scanner (System.in);
        System.out.println("-----Isi Data Diri Anda-----");
        System.out.print("Masukkan Nama Anda:   ");
        nama=input.nextLine();
        
        System.out.print("Masukkan NIM Anda:  ");
        nim=input.nextLine();
        
        System.out.print("Masukkan Prodi Anda:  ");
        prodi=input.nextLine();
        
        System.out.print("Masukkan Alamat Anda: ");
        alamat=input.nextLine();
        
        //Output
        System.out.println("-----Data Diri Anda-----");
        System.out.println("Nama Saya Adalah    "+nama);
        System.out.println("NIM Saya Adalah     "+nim);
        System.out.println("Prodi Saya Adalah   "+prodi);
        System.out.println("Alamat Saya di      "+alamat);
        System.out.println("-Selamat Anda Telah Mengisi Data Diri-");
    }
}