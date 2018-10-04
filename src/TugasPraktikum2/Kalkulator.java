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
class Kalkulator implements Operasi {
    //deklarasi
    private double Bil1, Bil2;
    
    //konstruktor
    Kalkulator ()
    {
        
    }
    Kalkulator(double Bil1, double Bil2)
    {
        this.Bil1 = Bil1;
        this.Bil2 = Bil2;
    }
    
    //getter
    public double getBil1()
    {
        return Bil1;
    };
    public double getBil2()
    {
        return Bil2;
    };
    
    //implementasi method
    public void Penjumlahan()
    {
        System.out.println(Bil1+Bil2);
    };
    public void Pengurangan()
    {
        System.out.println(Bil1-Bil2);
    };
    public double Perkalian()
    {
        return Bil1*Bil2;
    };
    public double Pembagian()
    {
        return Bil1/Bil2;
    };
};
