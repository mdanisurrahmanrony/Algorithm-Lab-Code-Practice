package LabTestQuestionSolve;
import java.util.Scanner;
public class DeleteSmallestElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt(),array[]=new int[size],i,smallest;
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++) array[i]=sc.nextInt();
        System.out.println("Array before deleting smallest element:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
        smallest=small(array);
        System.out.println("\nSmallest element is:"+smallest);
        int resultArr[]=deleteSmallest(array,smallest);
        System.out.print("Array after deleting smallest element:\n");
        for(i=0;i<(resultArr.length-1);i++) System.out.print(resultArr[i]+ " ");
    }
    public static int small(int arr[]){
        int i,small=arr[0];
        for(i=0;i<arr.length;i++){          
            if(small>arr[i]) small=arr[i];            
        }
        return small;
    }
    public static int[] deleteSmallest(int arr[],int small){
       int i;
       for(i=0; i<arr.length; i++)
       {
           if(arr[i] == small)
           {
                for(int j=i; j<(arr.length-1); j++) arr[j] = arr[j+1];              
           }
       }   
       return arr;
    }
}
