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
public class EratosthenesPrimeSieve implements PrimeSieve{
    private int ober;
    public EratosthenesPrimeSieve(int pobergrenze)
    {
     this.ober = pobergrenze;
    }
    
    @Override
    public boolean isPrime(int zahl) {
      
        ArrayList<Boolean> arr = new ArrayList<>();
        
        if(zahl <  2)
        {
            return false;
        }
        
        for(int i = 0; i <= zahl ; i++)
        {
            arr.add(i, true);
        }
        
        for (int i = 2; i <= zahl ; i++) {
            if(arr.get(i) == true || arr.get(i).equals(true))
            {
                int j = i;
                do
                {
                    j = j + i;
                    if(j <= zahl)
                    {
                        arr.set(j, false);
                    }
                }while(j <= zahl);
            }
        }
        return arr.get(zahl--);
    }

 @Override
    public void printPrimes() {
        System.out.println("Primzahlen: ");
        
        
        for(int i = 0; i <= this.ober; i++)
        { if(isPrime(i) == true && i > 1)
            {
                System.out.print(i + ",");
            }
        }
    } 
}
