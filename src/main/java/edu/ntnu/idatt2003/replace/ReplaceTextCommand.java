package edu.ntnu.idatt2003.replace;

import edu.ntnu.idatt2003.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  String target;
  String replacement;

  ReplaceTextCommand(String target, String replacement) {
    if (target == null) {
      throw new IllegalArgumentException("target cannot be null");
    }
    if (target.isEmpty()) {
      throw new IllegalArgumentException("target cannot be empty");
    }
    if (replacement == null) {
      throw new IllegalArgumentException("replacement cannot be null");
    }

    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    return text.replaceAll("(?i)" + target, replacement);
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
