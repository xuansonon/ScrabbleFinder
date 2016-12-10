import java.io.*;
import java.util.ArrayList;

class wordFinder {

  public static void scrabble(String scrabbleString, String word) {
    String[] wordCharacters = word.split("");
    String[] scrabbleChars = scrabbleString.split("");
    ArrayList<String> scrabble = new ArrayList<String>();
    for(String eachChar: scrabbleChars) {
      scrabble.add(eachChar);
    }

    for(String wordChars: wordCharacters) {
      if(scrabble.contains(wordChars)) {
        scrabble.remove(wordChars);
      } else {
        System.out.println("Cannot find word in this string!");
        return;
      }
    }

    System.out.println(word + " can be found in " + scrabbleString + ".");

  }

  public static String getInput() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = null;
    try {
      input = br.readLine();
    } catch(IOException e) {
      System.out.println("Input error. Exiting...");
      System.exit(0);
    }
    return input;
  }

  public static void main(String[] args) {
    System.out.print("Enter any scrabble pattern string: ");
    String scrabbleString = getInput();
    System.out.print("Enter a word to find: ");
    String wordSearch = getInput();
    scrabble(scrabbleString, wordSearch);
  }
}
