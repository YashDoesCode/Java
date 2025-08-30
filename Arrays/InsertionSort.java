// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
   public InsertionSort() {
   }

   static void insertionSort(int[] arr) {
      for(int i = 0; i < arr.length; ++i) {
         int temp = arr[i];

         int j;
         for(j = i - 1; j >= 0 && arr[j] > temp; --j) {
            arr[j + 1] = arr[j];
         }

         arr[j + 1] = temp;
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of elements in array : ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      Main.inputArray(arr);
      insertionSort(arr);
      System.out.println("Array after sorting:");
      System.out.println(Arrays.toString(arr));
   }
}
