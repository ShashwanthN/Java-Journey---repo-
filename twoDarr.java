import java.util.Scanner;

public class twoDarr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int n[] : arr){
            for(int m : n)
        {
            System.out.print(m + " ");
        }
        System.out.println();
        }
    }

}
