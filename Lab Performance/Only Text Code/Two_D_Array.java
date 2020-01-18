import java.util.Scanner;
public class Two_D_Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row,column,i,j;
        System.out.println("Enter row:");
        row=sc.nextInt();
        System.out.println("Enter column:");
        column=sc.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter array elemnts of two_D_array (row by row):");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe inputted two dimensional array is:");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
