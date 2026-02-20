package edu.ntnu.idatt2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {
  WrapLinesTextCommand(String opening, String end) {
    if (opening == null) {
      throw new IllegalArgumentException("opening cannot be null");
    }

    super(opening, end);
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    StringBuilder newTextBuiler = new StringBuilder(opening + text + end);

    int i = 0;
    while (newTextBuiler.indexOf("\n", i+1) >= 0) {
      i = newTextBuiler.indexOf("\n", i+1);
      newTextBuiler.insert(i+1, opening);
      newTextBuiler.insert(i, end);
      i += opening.length() * 2 - 1;
    }

    return newTextBuiler.toString();
  }
}
