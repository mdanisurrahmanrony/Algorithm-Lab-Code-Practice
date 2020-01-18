import java.util.Scanner;
public class mmmerge1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of left array:");
        int s1=sc.nextInt(),i,lr[]=new int[s1];
        System.out.println("Enter size of Right array:");
        int s2=sc.nextInt(),rr[]=new int[s2];
        System.out.println("Enter elements of left array sortedly:");
        for(i=0;i<s1;i++) lr[i]=sc.nextInt();
        System.out.println("Enter elements of right array sortedly:");
        for(i=0;i<s2;i++) rr[i]=sc.nextInt();
        System.out.println("\n\nLeft array is sortedly:");
        for(i=0;i<s1;i++) System.out.print(lr[i]+" ");
        System.out.println("\n\nRight array is sortedly:");
        for(i=0;i<s2;i++) System.out.print(rr[i]+" ");
        int ns=(s1+s2), arr[]=new int[ns],sortedArr[]=new int[ns];
        sortedArr=merge(lr,rr,arr);
        System.out.println("\n\nAfter merge, sorted array is:");
        for(i=0;i<ns;i++) System.out.print(sortedArr[i]+" ");
    }
    public static int[] merge(int lr[],int rr[],int arr[]){
        int i=0,j=0;
        int k=0,l,s1=lr.length,s2=rr.length,ns=(s1+s2);
        while(i<s1 && j<s2){
            if(lr[i] < rr[j]){
                arr[k++]=lr[i++];
            }
            else{
                arr[k++]=rr[j++];
            }
        }
        while(i<s1){
            arr[k++]=lr[i++];
        }
        while(j<s2){
            arr[k++]=rr[j++];
        }        
        return arr;
    }
}
