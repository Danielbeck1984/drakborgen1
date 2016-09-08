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
        int y = 1, i = 0, x = 0;
        int dinPlats = 0, fiendensPlats = 0, slagILuften = 0;
        int dinSkada = 0, fiendenSkada = 0;
        
        
        while (i < y) {
            
            
        
            randomGame rg = new randomGame();
            dinPlats = rg.Plats(dinPlats);
            fiendensPlats = rg.Plats(fiendensPlats);
            slagILuften = rg.SlagILuften(dinPlats, fiendensPlats);
            
            System.out.println(slagILuften);
            i = 2;

    }
        
               
        
         
           
           
    }
}
    

