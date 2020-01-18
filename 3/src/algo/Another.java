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
public class Another {
    static int sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++) sum+=arr[i];
        
        return sum;
    }
    
    static double average(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++) sum+=arr[i];
        
        return sum/arr.length;
    }
    
    static int count(int[] arr){
        int c = 0;
        for(int i=0; i<arr.length; i++) c++;
        
        return c;
    }
    static int maxValue(int[] arr){
       int max=0;
       
       for(int i=0; i<arr.length; i++){
           if(i==0) max = arr[i];
           
           else if(arr[i]>max)  max = arr[i];
       }
       return max;
    }
    
    static int minValue(int[] arr){
       int min=0;
       
       for(int i=0; i<arr.length; i++){
           if(i==0) min = arr[i];
           
           else if(arr[i]<min)  min = arr[i];
       }
       return min;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("MaxValue: "+maxValue(arr)+" MinValue: "+minValue(arr));
        System.out.println("Sum: "+sum(arr)+" Average: "+average(arr)+" Count: "+count(arr));
    }
}
