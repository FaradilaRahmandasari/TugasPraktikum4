/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

import java.io.*;

/**
 *
 * @author Asus
 */
class Utama {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Faradila Rahmandasari / XR6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //instance
        Manusia[] a = new Manusia[2];
        
        //deklarasi
        int x=0;
        
        do
        {
            // INPUT
            System.out.println("User " + (x+1));
            System.out.print("Masukkan tinggi badan anda (cm)   = " );
            double t = Double.parseDouble(br.readLine());
            System.out.print("Masukkan jenis kelamin anda (L/P) = ");
            String jk = br.readLine();
            
            // PROSES + OUTPUT
            if(jk.toUpperCase().equals("L"))
            {
                a[x] = new Laki_Laki(t);
                System.out.println("Berat badan ideal Laki-laki ini adalah " + a[x].HtgBBI());
                System.out.println();
            }
            else if(jk.toUpperCase().equals("P"))
            {
                a[x] = new Perempuan(t);
                System.out.println("Berat badan ideal Perempuan ini adalah " + a[x].HtgBBI());
                System.out.println();
            }
            x++;
        } while (x<2);
    }
}
