package edu.ntnu.idatt2003.replace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

  @Test
  void execute() {
    String text = "some text some text";
    String target = "some";
    String replacement = "different";
    String expectedResult = "different text some text";

    ReplaceFirstTextCommand replaceFirst = new ReplaceFirstTextCommand(target, replacement);

    assertEquals(expectedResult, replaceFirst.execute(text));
    assertThrows(IllegalArgumentException.class,
        () -> replaceFirst.execute(null));
  }
}