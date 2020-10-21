/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusbab5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class StudiKasus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int kode;
    String namabarang; 
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan Kode Barang (antara angka 1 sampai angka 3");
    kode = input.nextInt();
    switch (kode)
    {
        case 1 :
        namabarang = "Alat Olahraga";
        break;
        case 2 :
        namabarang = "Alat Elektronik";
        break;
        case 3 :
        namabarang = "Alat Masak";
        break;
        default :
        namabarang = "Anda Salah Memasukkan Kode";
        break;
    }
        System.out.println ("Kode yang anda Pilih : " + namabarang);
        
    }
    
}
