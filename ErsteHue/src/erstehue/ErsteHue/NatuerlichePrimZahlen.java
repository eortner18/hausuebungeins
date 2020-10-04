/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erstehue.ErsteHue;

import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class NatuerlichePrimZahlen {
    int ober;
    
    public NatuerlichePrimZahlen(int po) {
        ober = po;
    }
    
    public void numbersWithPrime()
    {
        ArrayList<Integer> geradeZahlen =new ArrayList<>();
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve();
       
        for (int i = 3; i <= ober; i++) {
            if(i % 2 == 0 )
            {
                geradeZahlen .add(i);
            }
        }
        
        
        for (int i = 0; i < geradeZahlen .size(); i++) {
        for (int j = 0; j < geradeZahlen .get(i); j++) {
             if(eps.isPrime(j)==true)
                {
                    for (int z = 0; z < geradeZahlen.get(i); z++) {
                        if(eps.isPrime(z)==true)
                        {
                            if(j+z==geradeZahlen .get(i))
                            {
                                System.out.println(geradeZahlen .get(i)+" summe: "+" = "+j+" + "+z);
                                if(i==geradeZahlen .size()-1)
                                {
                                   z=geradeZahlen .get(i);
                                   j=geradeZahlen .get(i);
                                }
                                else
                                {
                                    i++;
                                }                                
                            }
                        }
                        else
                        {               
                      }
                    }
                }
                    else
                    {               
                    }
            }
        }
    }  
    
}
