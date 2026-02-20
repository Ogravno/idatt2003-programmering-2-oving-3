package edu.ntnu.idatt2003.capitalize;

import edu.ntnu.idatt2003.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

   @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    StringBuilder newStringBuilder = new StringBuilder(text);
    newStringBuilder.setCharAt(0,
        Character.toUpperCase(text.charAt(0)));

    return newStringBuilder.toString();
  }
}
