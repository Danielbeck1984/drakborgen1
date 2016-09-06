/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drakborgen;

/**
 *
 * @author daniel
 */
public class randomGame {
    
    

    
    int i = 0;
    
    public static int Steg() {
        
        
        /* denna funktionen slumpar om man ska flytta frammåt, flytta bakåt eller
           stå kvar*/
        
        // slumpa ett tal mellan 0 & 20000
        int i =(int) (Math.random() * 20000);
        
        // kör modulus så det blir ett tal mellan 0-2
        int randomNum = i % 3;
        
        
        if (randomNum == 0){
            
                // ger variaben "tillSlump" värdet 0 o det betyder att man 
                // går ett steg framåt 
                System.out.println("1 steg framåt");
                return 0;
        }    
            
        else if (randomNum == 1) {
            
                // ger variaben "tillSlump" värdet 1 & det betyder att man
                // Står kvar på den platsen
                System.out.println("Stå kvar");
                return 1;
        }
        else {
                // ger variaben "tillSlump" värdet 2 & det betyder att man
                // går ett steg bakåt
                System.out.println("1 steg bakåt");
                return 2;
        }     
        
        
        
        
        
        //End
    }
    
    public static int Plats(int i){
        
        /* denna funktion används till för att slumpa fram vart man
           ställer sig i första stridsomgången då det är valfritt mer i spelet
        */
        
        // slumpar ett tal från 0 -2000
        int x = (int) (Math.random() * 2000);
        
        //modulus för att få ner randomvärdet till 0-3
        int plats = x % 4;
        
       
         if(plats == 0){
            // ger variaben värdet "0" som betyder "Styrka"
            System.out.println("Styrka");
            return 0;
        }
        
         else  if(plats == 1){
            // getr variaben värdet "1" som betyder "Psyke"
            System.out.println("Psyke");
            return 1;
        }
         
         else  if(plats == 2){
             
            // ger variaben värdet "2" som betyder "Vighet"
            System.out.println("Vighet");
            return 2;
        }
         else{
             
             // ger variaben värdet "3" som betyder "Rustning"
             System.out.println("Rustning");
             return 3;
         }
         
    }
    
    public static void StridFiende(int i){
        int fienden =0;
        
        if (i == 0){
            // för att flytta fienden framåt, bakåt eller stå kvar på
            // den platsen som den står på för stunden
            randomGame rg = new randomGame();
            rg.Steg(fienden);
            
            if (fienden == 0){
                
            }
            
            else if (fienden == 1){
                
            }
            
            else {
                
            }
           
        }
        // skapa 3 if satser till 1, 2, 3, för fiendens plats så den kan flytta
        // sig frammåt bakåt eller stå kvar på alla dom ställerna 
    }
             
        

    private void Steg(int fienden) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
