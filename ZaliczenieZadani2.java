/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaliczeniezadani2;

/**
 *
 * @author student
 */
public class ZaliczenieZadani2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kwotalokat = 0;
        
        LokataRoczna[] lR = new LokataRoczna[5];
        
        lR[0] = new LokataRocznaPlus(500, 2, "Lokata1");
        lR[1] = new LokataRocznaPlus(2000, 2.5, "Lokata2");
        lR[2] = new LokataRocznaPlus(700, 1, "Lokata1");
        lR[3] = new LokataRoczna(1500, 2);
        lR[4] = new LokataRoczna();

        
        for(int i = 0; i < 5; i++) lR[i].pokazDaneLokaty();
        
        int oplacalnosc = 0;
        
        for(int i = 0; i < 5; i++) {
             if(lR[i].getOprocentowanie() > lR[oplacalnosc].getOprocentowanie()) oplacalnosc = i;
        }
        System.out.print("\nNajbardziej oplacalna lokata jest: ");
        lR[oplacalnosc].pokazDaneLokaty();
        
        lR[4].zalozLokate();
        
        
        /*
        LokataRoczna[] l = new LokataRoczna[4];
        
        l[0] = new LokataRoczna(500, 2);        
        l[1] = new LokataRoczna(2000, 2.5);
        l[2] = new LokataRoczna(1500, 1.75);
        l[3] = new LokataRoczna(3000, 1.7);
        
        
        for(int i = 0; i < 4; i++) l[i].pokazDaneLokaty();
        
        for(int i = 0; i < 4; i+=2){
            kwotalokat += l[i].kwotaNaKoniecNaDwochLokatach(l[i + 1]); 
        }
        System.out.print("\nOstateczna kwota po wszystkich lokatach to: " + kwotalokat);
        
        double oplacalnosc = l[0].getOprocentowanie();
        
        for(int i = 0; i < 4; i++) {
             if(l[i].getOprocentowanie() > oplacalnosc) oplacalnosc = l[i].getOprocentowanie();
        }
        System.out.print("\nNajbardziej oplacalna lokata to ta z oprocentowaniem = " + oplacalnosc + "%");
        
        */
        
        
        
    }
    
}
