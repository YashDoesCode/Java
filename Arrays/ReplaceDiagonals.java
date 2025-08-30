package Arrays.DDA;

import java.util.Scanner;

public class ReplaceDiagonals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for squar matrix : ");
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        int rightD=0, leftD=0;
        System.out.println("Enter elements in "+n+" X "+n+" matrix.");
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n;i++){
            int temp=a[i][i];
            a[i][i] = a[i][n-i-1];
            a[i][n-i-1] = temp;
        }
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
               System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        sc.close();
    }
}
