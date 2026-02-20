package edu.ntnu.idatt2003.replaceText;

import edu.ntnu.idatt2003.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  String target;
  String replacement;

  ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String exceute(String text) {
    return text.replaceAll("(?i)" + target, replacement);
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
