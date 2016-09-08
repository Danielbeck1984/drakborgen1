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
    
    public static int Steg(int i) {
        
        
        /* 
        * denna funktionen slumpar om man ska flytta frammåt, flytta bakåt eller
        * stå kvar
        */
        
        // slumpa ett tal mellan 0 & 20000
        i =(int) (Math.random() * 20000);
        
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
        
        /* 
        * denna funktion används till för att slumpa fram vart man
        * ställer sig i första stridsomgången då det är valfritt mer i spelet
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
    
    public static int StridPlatsFörflytning(int i){
        
        /* 
        * i denna funktionen så kollar man vilken plats man står i
        * stridshjulet & sen flyttar den frammåt eller bakåt eller står kvar
        * på samma ställe
        */
        
        int fienden =0;
        
        if (fienden == 0) {
            // för att flytta fienden framåt, bakåt eller stå kvar på
            // den platsen som den står på för stunden
            randomGame rg = new randomGame();
            // hämtar ett värde mellan 0-2 för att se om man förflyttar sig
            fienden = rg.Steg(fienden);
            
            
            // om förflytningen är "0" så flyttas den ett steg frammåt
            if (fienden == 0){
                
                // om variaben "i" är "3" så ska den ändras till "0" på 
                // stridshjulet
                if(i == 3){
                    
                    return 0;
                    
                }
                
                // plus 1 så man tar ett steg framåt i stridshjulet
                else {
                    i = ++i;
                }
                
            }
            
            // om förflyttningen är "2" så flyttar man ett steg bakåt
            else if (fienden == 2){
                
                // om variaben "i" är "0" så ska den ändras till "3" på 
                // stridshjulet 
                if (i == 0){
                    
                return 3;
               
                }
                // ta bort 1 så man går ett steg bakåt i hjulet
                else{
                    i = --i;
                }
            
            }
           
        }
        
        // om ingen av dom följande har skett så står man kvar på samma ställe
        return i;
        
    }

    public static int StridsHjul(int i){
        
        if (i == 0){
            System.out.println("Styrka");
        }
        
        else if (i == 1){
            System.out.println("Psyke");
        }
        
        else if (i == 2){
            System.out.println("Vighet");
        }
        else {
            System.out.println("Rustning");
        }
        
        return i;
    }
             
    public static int SlagILuften(int i, int x){
        
        int slagILuften = 0;
        
        /*******************************************************************
         Test kör denna innan du skriver en text till denna
        
         Skissa lite på hur man kan göra slag i luften.
         funderar om det räker med en if else if sats med 2 stycken val i
         programet eller om man tänker fel just nu.
        ********************************************************************/
        
        if (i == 0 && x == 2 || i == 1 && x == 3){
            
            //om detta är upfyllt så blir det slag i luften
            slagILuften = 1;
            System.out.println("Slag i luften");
        }
        
              
        return slagILuften;
    }

    public static int TillDelaSkada(int dinSkada, int fiendensSkada, int dinPlats, int fiendensPlats){
        
        
        
        return 0;
    }
    
}
