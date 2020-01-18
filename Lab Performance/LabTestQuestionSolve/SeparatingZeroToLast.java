package LabTestQuestionSolve;
import java.util.Scanner;
public class SeparatingZeroToLast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt(),array[]=new int[size],i,j,temp;
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++) array[i]=sc.nextInt();
        System.out.println("Array before separating all zero to last:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(array[i]==0 && i<j){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("\nArray after separating all zero to last:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
    }
}
