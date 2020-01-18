package All_Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length for bubble sort:");
        int ln=sc.nextInt(),i,array[]=new int[ln];
        System.out.println("Enter array elements for bubble sort:");
        for(i=0;i<ln;i++) array[i]=sc.nextInt();
        System.out.println("\nAscending Order:");
        int ascd[]=ascendingOrder(array);
        for(i=0;i<ln;i++) System.out.print(ascd[i]+" ");
        System.out.println("\nDescending Order:");
        int dscd[]=descendingOrder(array);
        for(i=0;i<ln;i++) System.out.print(dscd[i]+" ");
    }
    public static int[] ascendingOrder(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] descendingOrder(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
