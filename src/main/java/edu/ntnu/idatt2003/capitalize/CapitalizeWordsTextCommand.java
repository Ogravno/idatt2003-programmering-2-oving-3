package edu.ntnu.idatt2003.capitalize;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("text cannot be null");
    }

    return Arrays.stream(text.split(" "))
        .map(word -> word.substring(0, 1).toUpperCase()
            + word.substring(1).toLowerCase())
        .collect(Collectors.joining(" "));
  }
}
