package edu.ntnu.idatt2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  String selection;

  WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
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

    return text.replace(selection, opening + selection + end);
    }

  public String getSelection() {
    return selection;
  }
}
