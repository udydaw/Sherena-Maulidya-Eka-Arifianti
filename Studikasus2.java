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
public class Studikasus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int pendapatan;
    double jasa, komisi, total;
    
    //deklarasi objek
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan Pendapatan Sales: Rp.");
    pendapatan = input.nextInt();
    
    //percabangan
    if (pendapatan <= 200000 && pendapatan >= 0){
    jasa = 10000;
    komisi = 1.0*pendapatan;
    }
    else
        if(pendapatan <= 500000){
        jasa = 20000;
        komisi = 0.15*pendapatan;
        }
        else
        {
         jasa = 30000;
         komisi = 0.2*pendapatan;
        }
    /*menghitung total*/
    total = komisi+jasa;
    System.out.println("Uang Jasa : Rp." + (int) jasa);
    System.out.println("Uang Komisi : Rp." + (int) komisi);
    System.out.println("----------------------------------");
    System.out.println("Uang Total : Rp." + (int) total);
    }
    
    }
    
