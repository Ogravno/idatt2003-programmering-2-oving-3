package edu.ntnu.idatt2003.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    return text.replaceFirst("(?i)" + target, replacement);
  }
}
