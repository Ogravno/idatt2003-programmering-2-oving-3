package edu.ntnu.idatt2003.wrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  @Test
  void execute() {
    String text = "First line\nSecond line\nhird line";
    String opening = "<p>";
    String end = "</p>";
    String expectedResult = "<p>First line</p>\n<p>Second line</p>\n<p>hird line</p>";

    WrapLinesTextCommand wrapLines = new WrapLinesTextCommand(opening, end);

    assertEquals(expectedResult, wrapLines.execute(text));
    assertThrows(IllegalArgumentException.class,
        () -> wrapLines.execute(null));
  }
}