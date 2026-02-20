package edu.ntnu.idatt2003.replace;

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
  void execute() {
    String text = "some text some text";
    String target = "some";
    String replacement = "different";
    String expectedResult = "different text different text";

    ReplaceTextCommand replaceAll =
        new ReplaceTextCommand(target, replacement);

    assertEquals(expectedResult, replaceAll.execute(text));
    assertThrows(IllegalArgumentException.class,
        () -> replaceAll.execute(null));
  }
}