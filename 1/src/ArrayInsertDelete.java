import java.util.Scanner;
public class ArrayInsertDelete {
    static int size,pos,value;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=sc.nextInt();
        int array[]=new int[size+1];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<size;i++)
            array[i]=sc.nextInt();
        array=insert(array);
        
    }
    public static int[] insert(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter position to insert:");
        pos=sc.nextInt();
        System.out.println("Enter value inserted number:");
        value=sc.nextInt();
        for(int i=size-1;i<=pos-1;i++)
            arr[i+1]=arr[i];
        return arr;
    }
}
