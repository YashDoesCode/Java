// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddMatrices {
   static int[][] c;

   public AddMatrices() {
   }

   static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
      if (r1 == r2 && c1 == c2) {
         c = new int[r1][c1];

         for(int i = 0; i < r1; ++i) {
            for(int j = 0; j < c1; ++j) {
               c[i][j] = a[i][j] + b[i][j];
            }
         }

      } else {
         c = null;
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of rows and columns of the first matrix : ");
      int r1 = sc.nextInt();
      int c1 = sc.nextInt();
      int[][] a = new int[r1][c1];
      System.out.println("Enter number of rows and columns of the second matrix : ");
      int r2 = sc.nextInt();
      int c2 = sc.nextInt();
      int[][] b = new int[r2][c2];
      System.out.println("Enter the elements of first matrix : ");

      int i;
      int j;
      for(i = 0; i < r1; ++i) {
         for(j = 0; j < c1; ++j) {
            a[i][j] = sc.nextInt();
         }
      }

      System.out.println("Enter the elements of second matrix : ");

      for(i = 0; i < r2; ++i) {
         for(j = 0; j < c2; ++j) {
            b[i][j] = sc.nextInt();
         }
      }

      add(a, r1, c1, b, r2, c2);
      if (c == null) {
         System.out.println("Invalid input.");
      } else {
         System.out.println(Arrays.deepToString(c));
      }

   }
}
