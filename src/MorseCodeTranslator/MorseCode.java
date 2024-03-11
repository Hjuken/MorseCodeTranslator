package MorseCodeTranslator;

import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        System.out.println("Welcome to the morse code translator. You can write your message in english or in morse code.");
        System.out.println("If you write in morse, put space between letters and / between words!");
        System.out.println("To finish message write: Stop");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter message:");
            String input = scanner.nextLine().toUpperCase();
            // Skanna input. Gör om all input till stora bokstäver

            if (isMorseCode(input)) {
                //om inputen är morse (med (is) en boolean metod sant/falskt)
                Morse morse = new Morse();
                String englishLetters = morse.getLettersFromMorse(input);
                //Hämtar resultatet från metoden getLettersFromMorse i Morse-klassen.
                System.out.println("In english: " + englishLetters);
                //Programmet skriver ut engelsk text

            } else {
                //om inputen är text
                Letters letters = new Letters();
                String morseCodeOutput = letters.getMorseCodeWord(input);
                // Hämtar resultatet från metoden getMorseCodeWord i Morse-klassen.
                System.out.println("Morse Code: " + morseCodeOutput);
                //skriver programmet ut morse
            }
            if (input.equals("STOP")) {
                //Om man skriver "Stop" så avbryts programmet
                break;
            }
        }
    }

    private static boolean isMorseCode(String input) {
        //Om input matchar tecknen nedan så returneras resultatet till isMorseCode
        return input.matches("^[\\s*/-]*$");
        // Ett reguljärt uttryck regex: Strängen börjar: ^ stutar $
        // inom [ ] finns de tecken som får förekomma i morsekoden.
        // Space: \\s Tecken: * / -
        // * efter [ ] innebär att de får förekomma 0 eller flera gånger.
    }
}
