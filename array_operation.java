import java.util.Scanner;
import java.lang.Thread;
public class array_operation extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit: ");
        int lmt = sc.nextInt();

        /* Creating an array */
        int arr[] = new int[lmt];

        for(int i = 0; i < lmt; i++)
        {
            System.out.print("Enter the "+i+" index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\t--ARRAY--");
        try{
            for (int i : arr) {
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // System.out.println();
        // System.out.println("\t--OPERATIONS--");
        // System.out.print("Enter the value you want to insert: ");
        // int val = sc.nextInt();

        // System.out.print("Enter in which position you want to enter the value: ");
        // int pos = sc.nextInt();

        // for(int i = 0; i < lmt; i++){

        // }
    }
}
