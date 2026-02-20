package edu.ntnu.idatt2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;

  CapitalizeSelectionTextCommand(String selection) {
    if (selection == null) {
      throw new IllegalArgumentException("selection cannot be null");
    }
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    StringBuilder newStringBuilder = new StringBuilder(text);
    newStringBuilder.setCharAt(text.indexOf(selection),
        Character.toUpperCase(text.charAt(text.indexOf(selection))));

    return newStringBuilder.toString();
  }

  public String getSelection() {
    return selection;
  }
}
