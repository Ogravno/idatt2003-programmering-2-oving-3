package edu.ntnu.idatt2003.wrap;

import edu.ntnu.idatt2003.TextCommand;

public class WrapTextCommand implements TextCommand {
  String opening;
  String end;

  WrapTextCommand(String opening, String end) {
    if (opening == null) {
      throw new IllegalArgumentException("opening cannot be null");
    }
    if (end == null) {
      throw new IllegalArgumentException("end cannot be null");
    }

    this.opening = opening;
    this.end = end;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    return opening + text + end;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }
}
