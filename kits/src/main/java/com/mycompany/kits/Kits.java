/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kits;
import java.util.Scanner;

/**
 *
 * @author CL3-PC23
 */
public class Kits {
        
        public static void main(String[] args){
    
       Scanner input = new Scanner (System.in);
       int p1;
       
       System.out.println("-Menu-");
       System.out.println("[1] = Snacks");
       System.out.println("[2] = Drinks");
     
         
        System.out.println("Enter your choice:");
        p1= input.nextInt();
     
        if (p1 == 1)
        {
            System.out.println("-Snacks-");
            System.out.println("[1] = Pyatos - 20");
            System.out.println("[2] = Noba - 22");
            
            System.out.println("Enter your choice:");
            int p2= input.nextInt();
            int pia, nova;
                pia = 20;
                nova = 22;
            
            if(p2==1)
            {
                System.out.println("Pyatos 20 pesos"); 
                
                
             System.out.println("Would you like to order drinks? [1]Yes or [2]No");
             int ch1 = input.nextInt();
             
             
                if(ch1==1)
                {
                System.out.println("-Drinks-");
                System.out.println("[1] = Wata - 10 ");
                System.out.println("[2] = Cowk - 20");
             
                System.out.println("Enter the drink of your choice:");
                int d1 = input.nextInt();
                int wata, coke;
                wata = 10;
                coke = 20;
             
                    if(d1 == 1)
                    {
                    System.out.println(" Wata 10 pesos"); 
                    int tot;
                    tot = wata + pia;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    
                    else if(d1 == 2)
                    
                    {
                      System.out.println(" Cowk 20 pesos"); 
                    int tot;
                    tot = coke + pia;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    
                    else if (d1 > 2)
                            {
                            System.out.println("1 or 2 only");
                            System.out.println("Pyatos 20 pesos");
                            System.out.println("Total is" + pia);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<pia)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=pia)
                        {
                            int chng;
                            chng = csh - pia;
                            System.out.println("Change is " + chng );
                        } 
                            }
                    
                    
             
                }
                else if(ch1 == 2 )
                {
                  System.out.println("Total is" + pia);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<pia)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=pia)
                        {
                            int chng;
                            chng = csh - pia;
                            System.out.println("Change is " + chng );
                        }      
                }
                
                else if (ch1 > 2)
                {
                    System.out.println("1 or 2 only");
                    System.out.println("Total is" + pia);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<pia)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=pia)
                        {
                            int chng;
                            chng = csh - pia;
                            System.out.println("Change is " + chng );
                        }
                    
                }
            }
            else if(p2==2)
            
            {
               System.out.println("Nova 22 pesos");
                
                
             System.out.println("Would you like to order drinks? [1]Yes or [2]No");
             int ch2 = input.nextInt();
             
             
                if(ch2==1)
                {
                System.out.println("-Drinks-");
                System.out.println("[1] = Wata - 10 ");
                System.out.println("[2] = Cowk - 20");
             
                System.out.println("Enter the drink of your choice:");
                int d1 = input.nextInt();
                int wata, coke;
                wata = 10;
                coke = 20;
             
                    if(d1 == 1)
                    {
                    System.out.println(" Wata 10 pesos"); 
                    int tot;
                    tot = wata + nova;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    
                    else if(d1 == 2)
                    {
                        System.out.println(" Cowk 20 pesos"); 
                    int tot;
                    tot = coke + nova;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    else if (d1 > 2)
                            {
                            System.out.println("1 or 2 only");
                            System.out.println("Nova 22 pesos");
                            System.out.println("Total is" + nova);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<nova)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=nova)
                        {
                            int chng;
                            chng = csh - nova;
                            System.out.println("Change is " + chng );
                        } 
                            }
                }
                else if(ch2 == 2)
                {
                    
                 System.out.println("Total is" + nova);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<nova)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=nova)
                        {
                            int chng;
                            chng = csh - nova;
                            System.out.println("Change is " + chng );
                        }  
                }
                
               else if (ch2 > 2)
                            {
                            System.out.println("1 or 2 only");
                            System.out.println("Total is" + nova);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<nova)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=nova)
                        {
                            int chng;
                            chng = csh - nova;
                            System.out.println("Change is " + chng );
                        }
                            }  
            }
            
             else if (p2 > 2)
                            {
                            System.out.println("1 or 2 only");
                            }
           
        }
        else if (p1 == 2)
        {
            System.out.println("-Drinks-");
            System.out.println("[1] = Wata - 10 ");
                System.out.println("[2] = Cowk - 20");
             
                System.out.println("Enter the drink of your choice:");
            int p2= input.nextInt();
            int wata, coke;
                wata = 10;
                coke = 20;
            
            if(p2==1)
            {
                System.out.println("Wata 10 pesos");
                
                
             System.out.println("Would you like to order snacks? [1]Yes or [2]No");
             int ch1 = input.nextInt();
             
             
                if(ch1==1)
                {
                System.out.println("-Snacks-");
                System.out.println("[1] = Pyatos - 20");
                System.out.println("[2] = Noba - 22");
             
                System.out.println("Enter the snack of your choice:");
                int d1 = input.nextInt();
                int pia, nova;
                nova = 22;
                pia = 20;
             
                    if(d1 == 1)
                    {
                    System.out.println(" Pyatos 20 pesos"); 
                    int tot;
                    tot = wata + pia;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    
                    else if(d1 == 2)
                    
                    {
                      System.out.println(" Noba 22 pesos"); 
                    int tot;
                    tot = coke + nova;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    
                    else if (d1 > 2)
                        {
                            System.out.println("1 or 2 only");
                            System.out.println("Wata 10 pesos");
                            System.out.println("Total is" + wata);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<wata)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=wata)
                        {
                            int chng;
                            chng = csh - wata;
                            System.out.println("Change is " + chng );
                        } 
                        }
             
                }
                else if (ch1 == 2)
                {
                    System.out.println("Wata 10 pesos");
                    System.out.println("Total is" + wata);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<wata)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=wata)
                        {
                            int chng;
                            chng = csh - wata;
                            System.out.println("Change is " + chng );
                        }  
                }
                
                else if (ch1 > 2) 
                {
                    System.out.println("1 or 2 only");
                    System.out.println("Wata 10 pesos");
                    System.out.println("Total is" + wata);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<wata)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=wata)
                        {
                            int chng;
                            chng = csh - wata;
                            System.out.println("Change is " + chng );
                        } 
                }
                
            }
            else if(p2==2)
            
            {
               System.out.println("Cowk 20 pesos");
                
                
             System.out.println("Would you like to order Snacks? [1]Yes or [2]No");
             int ch2 = input.nextInt();
             
             
                if(ch2==1)
                {
                System.out.println("-Snacks-");
                System.out.println("[1] = Pyatos - 20");
                System.out.println("[2] = Noba - 22");
             
                System.out.println("Enter the snack of your choice:");
                int d1 = input.nextInt();
                int pia, nova;
                nova = 22;
                pia = 20;
             
                    if(d1 == 1)
                    {
                    System.out.println(" Pyatos 20 pesos"); 
                    int tot;
                    tot = pia + coke;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    
                    else if(d1 == 2)
                    {
                        System.out.println(" Noba 22 pesos"); 
                    int tot;
                    tot = coke + nova;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                    }
                    else if (d1 > 2)
                        {
                            System.out.println("1 or 2 only");
                            System.out.println("Cowk 20 pesos");
                            int tot;
                    tot = coke;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                        }
                    
                }
                
                else if (ch2 == 2)
                {
                  System.out.println(" Cowk 20 pesos"); 
                    int tot;
                    tot = coke;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }  
                }
                
                else if (ch2 > 2)
                {
                    System.out.println("1 or 2 only");
                    System.out.println(" Cowk 20 pesos"); 
                    int tot;
                    tot = coke;
                   
                    System.out.println("Total is" + tot);
                    System.out.println("Enter your cash:");
                    int csh = input.nextInt();
                        
                        while(csh<tot)
                        {
                            System.out.println("Try Again");
                            System.out.println("Enter your cash:");
                            csh = input.nextInt();
                        }
                        if(csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is " + chng );
                        }
                }
                
                
            }
            else if(p2 > 2)
            {
                {
                            System.out.println("1 or 2 only");
                        }  
            }
        }
        else if (p1 > 2)
        {
            System.out.println("1 or 2 only");
        }
        
  } 
    
}


