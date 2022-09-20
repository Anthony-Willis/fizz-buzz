package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf() {//assert must be followed by boolean expression
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6));
  }
}