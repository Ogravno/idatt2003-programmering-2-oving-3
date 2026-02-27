package edu.ntnu.idatt2003;

import edu.ntnu.idatt2003.capitalize.CapitalizeWordsTextCommand;
import edu.ntnu.idatt2003.wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScriptTest {

  @Test
  void execute() {
    String text = "hello world";
    String expectedResult = "Hello Bye World Hello";

    List<TextCommand> textCommands = new ArrayList<>();
    textCommands.add(new WrapSelectionTextCommand("bye ", " hello", "world"));
    textCommands.add(new CapitalizeWordsTextCommand());

    Script script = new Script(textCommands);

    assertEquals(expectedResult, script.execute(text));
    assertThrows(IllegalArgumentException.class, () -> script.execute(null));
  }
}