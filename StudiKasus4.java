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
public class StudiKasus4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //membuat scanner dan variabel
        int nilai;
        String grade;
        Scanner scan = new Scanner (System.in);
        
        //mengambil input
        System.out.println("Inputkan nilai: ");
        nilai= scan.nextInt();
        
        //hitung gradenya
        if (nilai > 90){
            grade = "A";
        }else if (nilai > 80){
         grade = "B+";
        }else if (nilai > 70){
         grade = "B";
        }else if (nilai < 70){
         grade = "F";
        System.out.println("Grade: " + grade);
         
        }
    }
    
}
