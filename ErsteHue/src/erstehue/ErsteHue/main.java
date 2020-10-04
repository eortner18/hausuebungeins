/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erstehue.ErsteHue;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("wie viele Zahlen möchten sie ausgeben?");
        int z;
        z = sc.nextInt();
        
        EratosthenesPrimeSieve EpS = new EratosthenesPrimeSieve(z);
        //nur zum Test da :D
    }
    
}
