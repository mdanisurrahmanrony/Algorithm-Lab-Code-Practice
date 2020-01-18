import java.util.Scanner;
public class Odd_Even_Check {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check odd_even:");
        int num=sc.nextInt();
        if(Odd_Even(num)==1) System.out.println(num+" is an even number");
        else System.out.println(num+" is an odd number");
    }
    public static int Odd_Even(int n){
        if(n%2==0) return 1;
        else return 0;
    }
}
