package All_Sorting;
import java.util.Scanner;
public class InsertionSort_without_method {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size for insertion sort:");
        int size=sc.nextInt(),i,j,array[]=new int[size],temp;
        System.out.println("Enter array elements for insertion sort:");
        for(i=0;i<size;i++) array[i]=sc.nextInt();
        System.out.println("The array before sorting:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
        for(i=1;i<size;i++){
            j=i-1;
            temp=array[i];
            while(j>=0){
                if(temp<array[j])
                    array[j+1]=array[j];                
                else
                    break;
                j--;
                }
            array[j+1]=temp;
        }
        System.out.println("\nThe array after insertion sort:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
    }    
}
