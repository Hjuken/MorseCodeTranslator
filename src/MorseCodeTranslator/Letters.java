package MorseCodeTranslator;

import java.util.HashMap;

public class Letters {
    HashMap<String,String> lettersToMorse = new HashMap<>();
    public  Letters(){
        //Konstruktorn för klassen Letters, initialiserar min hashmap som heter lettersToMorse
        lettersToMorse.put("A","*-");
        lettersToMorse.put("B","-***");
        lettersToMorse.put("C","-*-*");
        lettersToMorse.put("D","-**");
        lettersToMorse.put("E","*");
        lettersToMorse.put("F","**-*");
        lettersToMorse.put("G","--*");
        lettersToMorse.put("H","****");
        lettersToMorse.put("I","**");
        lettersToMorse.put("J","*---");
        lettersToMorse.put("K","-*-");
        lettersToMorse.put("L","*-**");
        lettersToMorse.put("M","--");
        lettersToMorse.put("N","-*");
        lettersToMorse.put("O","---");
        lettersToMorse.put("P","*--*");
        lettersToMorse.put("Q","--*-");
        lettersToMorse.put("R","*-*");
        lettersToMorse.put("S","***");
        lettersToMorse.put("T","-");
        lettersToMorse.put("U","**-");
        lettersToMorse.put("V","***-");
        lettersToMorse.put("W","*--");
        lettersToMorse.put("X","-**-");
        lettersToMorse.put("Y","-*--");
        lettersToMorse.put("Z","--**");
        lettersToMorse.put("1","*----");
        lettersToMorse.put("2","**---");
        lettersToMorse.put("3","***--");
        lettersToMorse.put("4","****-");
        lettersToMorse.put("5","*****");
        lettersToMorse.put("6","-****");
        lettersToMorse.put("7","--***");
        lettersToMorse.put("8","---**");
        lettersToMorse.put("9","----*");
        lettersToMorse.put("0","-----");
        lettersToMorse.put(".","*-*-*-");
        lettersToMorse.put(",","--**--");
        lettersToMorse.put("?","**--**");
        lettersToMorse.put("!","-*-*--");
    }
    public String getMorseCodeLetter(String letter) {
        letter = letter.toUpperCase();
        // Gör om allt i strängen letter till stora bokstäver
        return lettersToMorse.getOrDefault(letter, "Not a correct letter. Try Again!");
        //Metod som hittar en bokstav och skickar morse, eller hittar inte och skickar "Try again"

    }
    public String getMorseCodeWord(String text) {
        //metoden getMorseCodeWord har en textsträng som argument.
        StringBuilder morseResult = new StringBuilder(); //Skapar StringBuilder objektet
        // 'morseResult', som bygger upp strängen med morse, vårt slutresultat.

        for (char character : text.toUpperCase().toCharArray()) {
            //En förbättrad for-loop (enhanced/for-each loop)
            //toCharArray() är en metod som konverterar en sträng till en array av tecken.
            // : colon indikerar starten för loopens block
            if (character == ' ') {
                morseResult.append("/ ");
                // om char är space så läggs / till för att separera morse-orden
            } else {
                String morseCode = getMorseCodeLetter(String.valueOf(character));
                //konverterar om varje char i (character) till strängar och anropar getMorseCodeLetter
                // för att få motsvarande morse.
                morseResult.append(morseCode).append(" ");
                //morseCode läggs till i morseResult.
                // Efter varje "morse-bokstav" läggs det till ett space
            }
        }
        return morseResult.toString().trim();
        //Konverterar morseResult till String
        // och trimmar bort eventuella ledande eller efterföljande mellanslag
    }
}

