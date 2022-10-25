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
public class LuasSegitigascanner {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tinggi: ");
         int t =input.nextInt();
         System.out.println("Masukkan alas: ");
         int a =input.nextInt();
         
         double luas=0.5 * a * t;
         System.out.println("hasil luas segitiga= " +luas );
        
        
    }   
}
