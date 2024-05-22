import java.util.Scanner;
public class linear_search extends Thread
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----LINEAR SEARCH PROGRAM----");
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        try{
            for(int i = 0; i < num; i++){
                System.out.print("Enter the value of "+i+": ");
                arr[i] = sc.nextInt();
            }
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Data successfully stored in the array !");
        try{
            for (int i : arr) {
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();

        System.out.print("Enter the value you want to find: ");
        int find = sc.nextInt();
        int count = 0; // Counter variable
        // int pos = 0;
        for(int i = 0; i < num; i++){
            if(arr[i] == find){
                count++;
            }
        }
        System.out.println("----RESULT----");
        if(count > 0){
            System.out.println("Element found "+count);
        }else{
            System.out.println("Element not found !");
        }
    }
}