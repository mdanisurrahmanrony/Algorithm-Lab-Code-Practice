import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number to check odd/even");        
        int num=sn.nextInt();
        if(OddEven(num)==1)
            System.out.println("Even");
        else
            System.out.println("Odd");
            
    }
    public static int OddEven(int num){
       if(num%2==0)
            return 1;
        else
            return 0;
    }
}
