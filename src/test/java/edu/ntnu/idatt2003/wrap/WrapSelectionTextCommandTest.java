package edu.ntnu.idatt2003.wrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  @Test
  void execute() {
    String text = "some text some other text some third text";
    String opening = "<p>";
    String end = "</p>";
    String selection = "some other text";
    String expectedResult = "some text <p>some other text</p> some third text";

    WrapSelectionTextCommand wrapSelection =
        new WrapSelectionTextCommand(opening, end, selection);

    assertEquals(expectedResult, wrapSelection.execute(text));
    assertThrows(IllegalArgumentException.class,
        () -> wrapSelection.execute(null));
  }
}