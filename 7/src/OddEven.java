/*25-09-2017*/
import java.util.Scanner;
public class OddEven {
    static int ev=0;
    static int od=0;
    public static void main(String[] args){
        int array[]={5,2,3,8,7,11,13,19,25,22,10};
        int[] oddArr=new int[array.length];
        int[] evenArr=new int[array.length];
        int i;
        /*odd_even(array,evenArr,oddArr);
        System.out.println("Even: ");
        for(i=0;i<ev;i++)
        {
            System.out.print(" "+evenArr[i]);
        }
        System.out.println("\n\nOdd: ");
        for(i=0;i<od;i++)
        {
            System.out.print(" "+oddArr[i]);
        }*/
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        array=new int[n+1];
        insert(array,6,23);
        System.out.println("\nAfter insert: ");
        for(i=0;i<n+1;i++)
        {
            System.out.print(" "+array[i]);
        }
}
        
    
    public static void odd_even(int array[], int evenArr[],int oddArr[]){
       int i,j=0,k=0;
        for(i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenArr[j]=array[i];
                j++;
                ev++;}
            else{
                oddArr[k]=array[i];
                k++;
                od++;
           }
        }
  
    }
    public static void insert(int array[], int location, int value){
        int i;
        for(i=array.length-2;i>=location;i--){
            array[i+1]=array[i];
           }
        array[i]=value;
       }
    
}