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
    

    
    int kvar = 0, fram = 0, bak = 0, i = 0;
    
    public void slump() {
        int i =(int) (Math.random() * 20000);
        
        int randomNum = i % 3;
        
        
        switch(randomNum){
            case 0:
                System.out.println("1 steg framåt");
                fram = ++fram;
                break;
                
            case 1:
                System.out.println("Stå kvar");
                kvar = ++kvar;
                break;
            default:
                System.out.println("1 steg bakåt");
                bak = ++bak;
                break;
                   
        }
        
        
        System.out.println(randomNum);
    }
    
    public static int Plats(int i){
        
        int x = (int) (Math.random() * 2000);
        
        int plats = x % 4;
        
       
         if(plats == 0){
            
            System.out.println("Styrka");
            return 0;
        }
        
         else  if(plats == 1){
            
            System.out.println("Psyke");
            return 1;
        }
         
         else  if(plats == 2){
            
            System.out.println("Vighet");
            return 2;
        }
         else{
             System.out.println("Rustning");
             return 3;
         }
             
          
    
    }
    
}
