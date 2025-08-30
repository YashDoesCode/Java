// Source code is decompiled from a .class file using FernFlower decompiler.
package PractisePrograms;

class B {
   int a;
   String b;

   B() {
      this.a = 10;
      this.b = "abc";
      System.out.println(this.a + this.b);
   }

   B(C ref) {
      this.a = ref.g;
      this.b = ref.h;
      System.out.println(this.a + this.b);
   }
}
