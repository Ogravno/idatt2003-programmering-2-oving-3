package edu.ntnu.idatt2003.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  @Test
  void execute() {
    String text = "some text";
    String expectedResult = "Some text";

    CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();

    assertEquals(expectedResult, capitalizeTextCommand.execute(text));
    assertThrows(IllegalArgumentException.class,
        () -> capitalizeTextCommand.execute(null));
  }
}