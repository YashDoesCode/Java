// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
   public LinearSearch() {
   }

   static int linearSearch(int[] arr, int key) {
      for(int i = 0; i < arr.length; ++i) {
         if (arr[i] == key) {
            return i;
         }
      }

      return -1;
   }

   public static void main(String[] args) throws IOException {
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
      System.out.println("Enter the number of elements in the array: ");
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      Main.inputArray(arr);
      System.out.println("Enter the key: ");
      int key = Integer.parseInt(br.readLine());
      int r = linearSearch(arr, key);
      if (r != -1) {
         System.out.println("element found at : " + r);
      } else {
         System.out.println("Element not found.");
      }

   }
}
