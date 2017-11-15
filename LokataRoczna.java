/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaliczeniezadani2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class LokataRoczna implements ILokata {
    
    private double kwota = 0;
    private double oprocentowanie = 0;
    
    
    public double getOprocentowanie(){ return oprocentowanie;}
    
    
    LokataRoczna() {}
    
    LokataRoczna(double kwota, double oprocentowanie)
    {
        this.kwota = kwota;
        this.oprocentowanie = oprocentowanie;
    }
    
    public void zalozLokate()
    {
        Scanner c = new Scanner(System.in);
        try {
            System.out.print("Podaj kwote: ");
            this.kwota = c.nextDouble();
            System.out.print("Podaj oprocentowanie: ");
            this.oprocentowanie = c.nextDouble();
        }
        catch(InputMismatchException e) {}
        
    
        
    }
    
    public void pokazDaneLokaty()
    {
        System.out.print("Kwota: " + kwota + ", Oprocentowanie: " + oprocentowanie + "%" + ". Kwota po zako nczeniu: " + this.kwotaNaKoniec() + "\n");
    }
    
    
    public double kwotaNaKoniec()
    {
        return (kwota + (oprocentowanie * kwota / 100.0));
    }
    
    public double kwotaNaKoniecNaDwochLokatach(LokataRoczna l)
    {
        return this.kwotaNaKoniec() + l.kwotaNaKoniec();
    }
    
    public void bardziejOplacalna(LokataRoczna l)
    {
        if(l.oprocentowanie > this.oprocentowanie) System.out.print("Bardziej oplacalna jest lokata druga(pro. " + l.oprocentowanie);
        else System.out.print("Bardziej oplacalna jest lokata pierwsza(pro. " + this.oprocentowanie);
    }
}
