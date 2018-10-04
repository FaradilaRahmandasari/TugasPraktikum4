/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author Asus
 */
import java.io.*;
public class Utama {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Faradila Rahmandasari / XR6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        //instansi class
        Kalkulator k = new Kalkulator();
        
        //input
        
        System.out.print("Masukkan bilangan pertama : ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan bilangan kedua   : ");
        double b = Double.parseDouble(br.readLine());
        
        k = new Kalkulator (a,b);
        
        System.out.println();
        
        //output
        System.out.println("~~~~~KALKULATOR~~~~~");
        System.out.print("Hasil Penjumlahan  = ");
                k.Penjumlahan();
        System.out.print("Hasil Pengurangan  = ");
                k.Pengurangan();
        System.out.println("Hasil Perkalian    = " + k.Perkalian());
        System.out.println("Hasil Pembagian    = " + k.Pembagian());
    }
}
