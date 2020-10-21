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
public class StudiKasusBab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double totalbeli, potongan = 0, jumlahyangdibayar;
    Scanner input = new Scanner (System.in);
    System.out.print("Total pembelian = Rp. ");
    totalbeli = input.nextDouble(); 
    if (totalbeli >= 50000)
    potongan = 0.2 * totalbeli;
    System.out.println("Besarnya Potongan : Rp." + potongan);
    jumlahyangdibayar = totalbeli - potongan;
    System.out.println("Jumlah yang harus dibayar: Rp." +jumlahyangdibayar);
    
    }
    
}
