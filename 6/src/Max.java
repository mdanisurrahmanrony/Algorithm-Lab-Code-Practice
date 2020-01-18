/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import java.util.Scanner;
public class Max 
{
    public static void main(String[] args) 
    {
        int num, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter elements:");
        for(int i = 0; i < num; i++)
        {
            array[i] = sc.nextInt();
        }
        max = array[0];
        for(int i = 0; i < num; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        System.out.println("Maximum number in the array list is:"+max);
    }
}