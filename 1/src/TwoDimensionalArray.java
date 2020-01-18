import java.util.Scanner;
public class TwoDimensionalArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        System.out.println("Enter column:");
        int column=sc.nextInt();
        int array[][]=new int[row][column];
        System.out.println("Enter elements row by row:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
