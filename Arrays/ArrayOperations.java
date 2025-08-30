// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOperations {
   public ArrayOperations() {
   }

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter number of elements in array : ");
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      Main.inputArray(arr);
      deleteElement(arr);
      System.out.println("Array after element deletion.");
      Main.printArray(arr);
   }

   public static void deleteElement(int[] arr) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the index on which deleted element is present: ");
      int pos = Integer.parseInt(br.readLine());

      for(int i = pos + 1; i < arr.length - 1; ++i) {
         arr[i + 1] = arr[i];
      }

   }
}
