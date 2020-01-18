import java.util.Scanner;
public class Odd_Even_Separation {
    public static int j=0,k=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length or number of array elements:");
        int num=sc.nextInt(),i,array[]=new int[num];        
        System.out.println("Enter array elements:");
        for(i=0;i<num;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        for(i=0;i<num;i++){
            System.out.print(array[i]+" ");
        }
        int odd_array[]=new int[array.length];                  
        int even_array[]=new int[array.length];
        Odd_Even_Separation(array,odd_array,even_array);
        System.out.println("\nOdd array is:");
        for(i=0;i<k;i++) System.out.print(odd_array[i]+" ");
        System.out.println("\nEven array is:");
        for(i=0;i<j;i++) System.out.print(even_array[i]+" ");
    }
    public static void Odd_Even_Separation(int arr[],int odd_arr[], int even_arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) even_arr[j++]=arr[i];
            else odd_arr[k++]=arr[i];
        }
    }
}