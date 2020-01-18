package String;
import java.util.Arrays;
public class ArrayString1 {
    public static void main(String args[]){
        String inputArray= "My name is Rony";
        String outputArray=sortString(inputArray);
        System.out.println("Input String:"+inputArray);
        System.out.println("Output String:"+outputArray);
    }
    public static String sortString(String inputArray){
        char tempArray[]=inputArray.toCharArray();  //convert input string to char array
        Arrays.sort(tempArray);    //sort temp array
        return new String(tempArray);   //return new sorted string
    }
}
