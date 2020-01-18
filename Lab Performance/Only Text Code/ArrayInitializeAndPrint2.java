public class ArrayInitializeAndPrint2 {
    public static void main(String args[]){
        int array[]=new int[5];
        array[0]=19;
        array[1]=65;
        array[2]=17;
        array[3]=23;
        array[4]=52;
        System.out.println("Inputted array is:");
        for(int i=0;i<array.length;i++) System.out.println(array[i]+" ");
        System.out.println("\n4 number array element is (whose number index is 3):  "+array[3]);
    }
}