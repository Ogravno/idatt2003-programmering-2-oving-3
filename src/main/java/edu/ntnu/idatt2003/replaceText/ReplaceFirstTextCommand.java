package edu.ntnu.idatt2003.replaceText;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String exceute(String text) {
    return text.replaceFirst("(?i)" + target, replacement);
  }
}
