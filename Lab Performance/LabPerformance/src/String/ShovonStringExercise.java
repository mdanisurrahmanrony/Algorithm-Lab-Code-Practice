package String;
import java.util.*;
public class ShovonStringExercise {
    public static void main(String[] args) {
        String name,sortedName;
        System.out.println("Input the String:");
        Scanner input = new Scanner(System.in);
        name=input.nextLine();
        sortedName=sort(name);
        System.out.println("The sorted string is:"+sortedName);
        System.out.println("The sorted string with all upper letter is: "+sortedName.toUpperCase());
        System.out.println("The sorted string with all lower letter is: "+sortedName.toLowerCase());
    }
    static String sort(String name){        
        char [] nam=name.toCharArray();
        Arrays.sort(nam);        
        return new String(nam);
    }    
}