// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.util.Scanner;

public class DeleteAnElement {
   public DeleteAnElement() {
   }

   public static void main(String[] args) {
      int temp = -1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      Main.inputArray(arr);
      System.out.println("Enter the number to be deleted:");
      int d = sc.nextInt();

      int i;
      for(i = 0; i < arr.length; ++i) {
         if (arr[i] == d) {
            temp = 0;
         }
      }

      if (temp != 0) {
         System.out.println("Element not found in original array.");
         sc.close();
      } else {
         label34:
         for(i = 0; i < arr.length; ++i) {
            if (arr[i] == d) {
               int j = i;

               while(true) {
                  if (j >= arr.length - 1) {
                     break label34;
                  }

                  arr[j] = arr[j + 1];
                  ++j;
               }
            }
         }

         System.out.println("Array after deleting element.");
         Main.printArray(arr);
         sc.close();
      }
   }
}
