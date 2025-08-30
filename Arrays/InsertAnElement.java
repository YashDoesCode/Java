// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.util.Scanner;

public class InsertAnElement {
   public InsertAnElement() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      A.inputArray(arr);
      insertElement(arr);
      System.out.println("Final array after insertion:");
      Main.printArray(arr);
      sc.close();
   }

   public static void insertElement(int[] arr) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the element to be inserted and at which position");
      System.out.print("Element:");
      int element = sc.nextInt();
      System.out.print("Pos(Index+1):");
      int pos = sc.nextInt();

      for(int i = arr.length - 1; i > pos - 1; --i) {
         arr[i] = arr[i - 1];
      }

      arr[pos - 1] = element;
      sc.close();
   }
}
