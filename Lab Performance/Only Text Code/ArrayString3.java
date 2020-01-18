package String;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayString3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to sort:");
        String str=sc.nextLine();
        char chr[]=str.toCharArray();
        Arrays.sort(chr);
        String sorted=new String(chr);
        System.out.println("Input String:"+str);
        System.out.println("Output String:"+sorted);
    }
}
