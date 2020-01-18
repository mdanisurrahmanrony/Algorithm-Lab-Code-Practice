/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Algo {

    /**
     * @param args the command line arguments
     */
    
    static void evenOdd(int x){
         if(x%2==0)
                System.out.println("Even");
         else   System.out.println("Odd");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        evenOdd(sc.nextInt());
    }
    
}
