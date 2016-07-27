package com.learn.bases;

/**
 * Created by dmitry on 27.07.16.
 */
public class Main {
  public static void main(String[] args) {
    int iterCount = 0;
//    for (int i = 2; i <= 100; i++) {
//      System.out.print("Dividers (Делители) " + i + ": ");
//
//      if (i % 2 != 0) {
//        for (int j = 1; j < i; j+=2) {
//          iterCount ++;
//          if ((i % j) == 0) {
//            System.out.print(j + " ");
//          }
//        }
//      } else {
//        for (int j = 2; j < i; j+=2) {
//          iterCount ++;
//          if ((i % j) == 0) {
//            System.out.print(j + " ");
//          }
//        }
//      }
//
//      System.out.println();
//
//    }
    for (int i = 2; i <= 100; i++) {
      System.out.print("Dividers (Делители) " + i + ": ");
      for (int j = 2; j < i; j++) {
        iterCount ++;
        if ((i % j) == 0) System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println(iterCount);
  }
}
