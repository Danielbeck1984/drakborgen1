/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drakborgen;

/**
 *
 * @author danie
 */
public class Drakborgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Fkvar = 0, Ffram = 0, Fbak = 0, y = 1, i = 0, x = 0;
        int Dkvar = 0, Dfram = 0, Dbak = 0;
        int dinPlats = 0, fiendensPlats = 0;
        
        
        
        while (i < y) {
            
            
        
            randomGame rg = new randomGame();
            rg.Plats(dinPlats);
            
            /*Ffram = Ffram + rg.fram;
            Fkvar = Fkvar + rg.kvar;
            Fbak = Fbak + rg.bak;
           */
            
            i = ++i;

    }
        
                while (x < y) {
            
            
        
            randomGame rg = new randomGame();
            rg.slump();
            /*Dfram = Dfram + rg.fram;
            Dkvar = Dkvar + rg.kvar;
            Dbak = Dbak + rg.bak;
           */
            
            x = ++x;

    }
        
         /*  System.out.println("Fienden Fram " + Ffram);
           System.out.println("Fienden kvar " + Fkvar);
           System.out.println("Fienden bak " + Fbak);
           
           System.out.println("Du Fram " + Dfram);
           System.out.println("Du kvar " + Dkvar);
           System.out.println("Du bak " + Dbak);
       */
           
           
    }
}
    

