/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Keliling_Persesgi {

    public static void main(String[] args) {
        //    deklarasi
        int sisi;
        double keliling;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        System.out.println("========== KELILING PERSEGI ==========\n\n");
     
        System.out.println("input sisi");
        sisi = hitung.nextInt();

        //    proses
        keliling = Double.valueOf(4*sisi);

        System.out.println("keliling persegi");
        System.out.println(keliling);
    }
}
