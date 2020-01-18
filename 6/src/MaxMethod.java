import java.util.Scanner;
public class MaxMethod 
{
    public static void main(String[] args) 
    {
        int num, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter elements:");
        for(int i = 0; i < num; i++)
        {
            array[i] = sc.nextInt();
        }
        max=maxx(array,num);
        System.out.print("Maximum number among the numbers is:"+max);
    }
    public static int maxx(int[] array, int num){
        int max = array[0];
        for(int i = 0; i < num; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        return max;
    }
}