package edu.ntnu.idatt2003.wrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {
  @Test
  void constructor() {
    assertDoesNotThrow(() -> new WrapTextCommand("opening", "end"));
    assertThrows(IllegalArgumentException.class,
        () -> new WrapTextCommand(null, "end"));
    assertThrows(IllegalArgumentException.class,
        () -> new WrapTextCommand("opening", null));
  }

  @Test
  void execute() {
    String text = "some text";
    String opening = "opening";
    String end = "end";
    String expectedResult = "openingsome textend";

    WrapTextCommand wrapLines =
        new WrapTextCommand(opening, end);

    assertEquals(expectedResult, wrapLines.execute(text));
    assertThrows(IllegalArgumentException.class,
        () -> wrapLines.execute(null));
  }
}