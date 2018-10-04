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
class Laki_Laki extends Manusia {
    
    public Laki_Laki(double TB)
    {
        super(TB);
    }
    
    public double HtgBBI()
    {
        return(super.getTB()-100)*0.9;
    }
}
