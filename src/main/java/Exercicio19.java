// IMPORTS

import java.util.Scanner;

public class Exercicio19 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      int n;
      String txt;

      // COLLECT DATA
      System.out.print("QT : ");
      n = sc.nextInt();
      System.out.print("TXT : ");
      txt = sc.next();

      // OUTPUT
      for (int i = 0; i < n; i++) {
         System.out.println(txt);
      }
   }
}
