// Source code is decompiled from a .class file using FernFlower decompiler.
package PractisePrograms;

public class C {
   int g;
   String h;

   C(int g, String h) {
      this.g = g;
      this.h = h;
   }

   C(C ref) {
      this.g = ref.g;
      this.h = ref.h;
   }

   public void display(C ref) {
      System.out.println(ref.g);
      System.out.println(ref.h);
   }

   public static void main(String[] args) {
      C ref = new C(5, "abc");
      C ref2 = new C(ref);
      ref.display(ref);
      ref2.display(ref2);
   }
}
