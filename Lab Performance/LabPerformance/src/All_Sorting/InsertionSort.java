package All_Sorting;
import java.util.Scanner;
public class InsertionSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size for insertion sort:");
        int size=sc.nextInt(),i,j,array[]=new int[size],temp;
        System.out.println("Enter array elements for insertion sort:");
        for(i=0;i<size;i++) array[i]=sc.nextInt();
        System.out.println("The array before sorting:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
        int ascd[]=ascending(array);
        System.out.println("\nThe array in ascending order after insertion sort:");
        for(i=0;i<size;i++) System.out.print(ascd[i]+" ");
        int dscd[]=descending(array);
        System.out.println("\nThe array in descending order after insertion sort:");
        for(i=0;i<size;i++) System.out.print(dscd[i]+" ");        
    }
    public static int[] ascending(int arr[]){
        int i,j,temp;
        for(i=1;i<arr.length;i++){
            j=i-1;
            temp=arr[i];
            while(j>=0){
                if(temp<arr[j])
                    arr[j+1]=arr[j];                
                else
                    break;
                j--;
                }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static int[] descending(int arr[]){
        int i,j,temp;
        for(i=1;i<arr.length;i++){
            j=i-1;
            temp=arr[i];
            while(j>=0){
                if(temp>arr[j])
                    arr[j+1]=arr[j];                
                else
                    break;
                j--;
                }
            arr[j+1]=temp;
        }
        return arr;
    }
}
