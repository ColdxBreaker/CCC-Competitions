package CCC_Competitions.Year_2015;

import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;

import java.util.Scanner;

public class Problem_J3_Rovarspraket {
    private static final String VOWELS = "aeiou";
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private StringBuilder convertedWord = new StringBuilder();

    public static void main(String[] args) {
        Problem_J3_Rovarspraket word1 = new Problem_J3_Rovarspraket();
//        word1.convertWord(word1.getInput());

    }

    public String getInput() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public boolean isConsonant(char character) {
        if (!VOWELS.contains(Character.toString(character))) {
            return true;
        }
        return false;
    }
}

//    public void convertWord(String r  awWord) {
////        for (int i = 0; i < rawWord.length(); i++) {
////            if (isConsonant(rawWord.charAt(i))) {
////                convertedWord.append(rawWord.charAt(i));
////            }
////        }
//    }

