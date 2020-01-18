import java.util.Scanner;
public class InitializeTwoD_Array {
    public static void main(String args[]){
        int array[][]={{23,15,8,12},{5,8,16,22},{18,12,6,15}};
        System.out.println("The array is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
