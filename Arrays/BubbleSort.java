// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
   public BubbleSort() {
   }

   public static void bubbleSortArray(int[] arr) {
      boolean isSwapped = false;

      for(int i = 0; i < arr.length - 1; ++i) {
         for(int j = 0; j < arr.length - 1 - i; ++j) {
            if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
               isSwapped = true;
            }
         }

         if (!isSwapped) {
            break;
         }
      }

   }

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter number of elements in array:");
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      Main.inputArray(arr);
      System.out.println("Array before sorting : ");
      Main.printArray(arr);
      System.out.println("Array after sorting: ");
      bubbleSortArray(arr);
      Main.printArray(arr);
   }
}
