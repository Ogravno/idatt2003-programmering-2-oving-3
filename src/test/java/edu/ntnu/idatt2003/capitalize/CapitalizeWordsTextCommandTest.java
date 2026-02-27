package edu.ntnu.idatt2003.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  @Test
  void execute() {
    CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
    assertEquals("Hello World", capitalizeWordsTextCommand.execute("hello world"));
    assertEquals("Hello World", capitalizeWordsTextCommand.execute("hELLO wORLD"));
  }
}