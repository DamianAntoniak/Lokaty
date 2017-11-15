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
public class LokataRocznaPlus extends LokataRoczna {
    
    private String nazwaLokaty = "Lokatka";
    
    LokataRocznaPlus(double kwota, double oprocentowanie, String nazwaLokaty)
    {
        super(kwota, oprocentowanie);
        this.nazwaLokaty = nazwaLokaty;
    }
    
    
    @Override
    public void pokazDaneLokaty()
    {
        System.out.print("\nNazwa: " + nazwaLokaty + ", ");
        super.pokazDaneLokaty();
    }
    
    
    @Override
    public void zalozLokate()
    {
        Scanner c = new Scanner(System.in);
        try {
            System.out.print("Podaj nazwe lokaty: ");
            this.nazwaLokaty = c.next();
        }
        catch(InputMismatchException e) {}
        
        super.zalozLokate();
  
    }
}
