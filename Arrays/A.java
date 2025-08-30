// Source code is decompiled from a .class file using FernFlower decompiler.
package Arrays;

import java.util.Scanner;

public class A {
   public A() {
   }

   public static void main(String[] args) {
   }

   public static void inputArray(int[] arr) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the elements.");

      for(int i = 0; i < arr.length; ++i) {
         arr[i] = sc.nextInt();
      }

      sc.close();
   }

   public static void printArrayTill(int[] arr, int index) {
      for(int i = 0; i < index; ++i) {
         System.out.println(arr[i]);
      }

   }

   public static void swap(int[] arr, int index1, int index2) {
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
   }

   public static void printArray(int[] arr) {
      int[] var1 = arr;
      int var2 = arr.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int e = var1[var3];
         System.out.println(e);
      }

   }
}
