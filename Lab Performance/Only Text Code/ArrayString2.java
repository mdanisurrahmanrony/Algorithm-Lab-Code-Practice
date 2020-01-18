package String;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayString2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to sort alphabetically:");
        String inputArray=sc.nextLine();    //next er Line shoho nile (Ortaht nextLine() nile) space er jhamela hoy na. Kintu shudhu next() nile space er porer string ney na
        String outputArray=sortSring(inputArray);
        System.out.println("Input Sring: "+inputArray);
        System.out.println("Output Sring: "+outputArray);
    }
    public static String sortSring(String inputArray){
        char tempArray[]=inputArray.toCharArray();     //convert string into char array
        Arrays.sort(tempArray);    //sort tempArray alphabetically
        return new String(tempArray);   //return new sorted string        
    }
}
