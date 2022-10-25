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
public class Keliling_segitiga {
    
   public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Input Alas: ");

  int alas = input.nextInt();

  System.out.print("Input tinggi : ");

  int tinggi = input.nextInt();
  
  int keliling = (int)(alas*3);

  double luas = (double)(alas*tinggi)/2;

  System.out.println("Luas Segitiga :" +luas);
  System.out.print("Keliling Segitiga :"+keliling);

 }

}

