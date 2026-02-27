package edu.ntnu.idatt2003;

import java.util.List;

public class Script {
  List<TextCommand> textCommands;

  Script(List<TextCommand> textCommands) {
    if (textCommands == null) {
      throw new IllegalArgumentException("textCommands cannot be null");
    }
    this.textCommands = textCommands;
  }

  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    String result = text;
    for (TextCommand textCommand : textCommands) {
      result = textCommand.execute(result);
    }
    return result;
  }
}