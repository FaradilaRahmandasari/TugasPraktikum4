/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author Asus
 */
abstract class Manusia {
    private double TinggiBadan;
    
    //konstruktor
    public Manusia(double TB)
    {
        TinggiBadan = TB;
    }
    
    //getter
    public double getTB()
    {
        return TinggiBadan;
    }
    
    //method htgbbi
    public abstract double HtgBBI();
}
