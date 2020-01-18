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
        for(int i=0; i<arr.length; i++)
            if(arr[i]%2!=0) c++;
        
        return c;
    }
    
    static int secLargest(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
            
        }
        
        return arr[arr.length-2];
    }
    
    static int xSecLargest(int[] arr){
        int max = maxValue(arr);
        int j=0;
        
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=max)
                temp[j++] = arr[i];
        }
        
        return maxValue(temp);
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
        
        int[][] twoD = new int[5][5];
        
        for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
                twoD[i][j] = sc .nextInt();
            }
        }
        
         for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(twoD[i][j]+" ");
            }
             System.out.println();
        }
        
        System.out.println("Second Largest: "+xSecLargest(arr));       
        System.out.println("MaxValue: "+maxValue(arr)+" MinValue: "+minValue(arr));
        System.out.println("Sum: "+sum(arr)+" Average: "+average(arr)+" Count: "+count(arr));
    }
}
