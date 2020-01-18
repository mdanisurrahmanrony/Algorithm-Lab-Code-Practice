import java.util.Scanner;
public class Array_Insert_Delete {
    public static int size,pos,value;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        size=sc.nextInt();
        int i,array[]=new int[size+1];
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++) array[i]=sc.nextInt();
        System.out.println("Array elements before insertion and deletion:");
        for(i=0;i<size;i++) System.out.print(array[i]+" ");
        int arrayInsert[]=insert(array);
        System.out.println("After inserting new array element the array is:");
        for(i=0;i<size+1;i++) System.out.print(arrayInsert[i]+" ");
        int deleteArray[]=delete(array);
        System.out.println("\nAfter deleting new array element the array is:");
        for(i=0;i<size;i++) System.out.print(deleteArray[i]+" ");
    }
    public static int[] insert(int arr[]){
        Scanner sn=new Scanner(System.in);        
        System.out.println("\nEnter position and value to insert in array:");
        pos=sn.nextInt();
        value=sn.nextInt();
        for(int i=size-1;i>=pos-1;i--) arr[i+1]=arr[i];
        arr[pos-1]=value;
        return arr;
    }
    public static int[] delete(int arr[]){
        for(int i=pos-1;i<size;i++) arr[i]=arr[i+1];
        return arr;
    }
}
