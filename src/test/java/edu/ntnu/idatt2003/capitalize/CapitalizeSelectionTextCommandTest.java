package edu.ntnu.idatt2003.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  @Test
  void execute() {
    CapitalizeSelectionTextCommand capitalizeSelectionTextCommand =
        new CapitalizeSelectionTextCommand("world");
    assertEquals("hello World hello",
        capitalizeSelectionTextCommand.execute("hello world hello"));

      assertThrows(IllegalArgumentException.class,
          () -> capitalizeSelectionTextCommand.execute(null));
  }
}