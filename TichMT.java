import java.util.Scanner;

public class TichMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++){   
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[n][m];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + test + ":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int x = 0;
                    for(int k = 0; k < m; k++){
                        x += a[i][k] * a[j][k];
                    }
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}