package com.tlglearning;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    //for (int i = 1; i <= 100; i++){
      //System.out.println(FizzBuzz.valueOf(i));
    int i = 1;
    do {
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.printf("%d: %s%n", i, value);
      i++;
    }while (i <= 100);
  }

}
