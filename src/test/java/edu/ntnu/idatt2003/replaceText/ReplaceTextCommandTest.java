package edu.ntnu.idatt2003.replaceText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceTextCommandTest {
  @Test
  void constructor() {
    assertDoesNotThrow(() -> new ReplaceTextCommand("target", "replacement"));
    assertThrows(IllegalArgumentException.class,
        () -> new ReplaceTextCommand(null, "replacement"));
    assertThrows(IllegalArgumentException.class,
        () -> new ReplaceTextCommand("some", null));
    assertThrows(IllegalArgumentException.class,
        () -> new ReplaceTextCommand("", "replacement"));
  }

  @Test
  void exceute() {
    String text = "some text some text";
    String target = "some";
    String replacement = "different";
    String expectedResult = "different text different text";

    ReplaceTextCommand replaceNormal =
        new ReplaceTextCommand(target, replacement);

    assertEquals(expectedResult, replaceNormal.exceute(text));
  }
}