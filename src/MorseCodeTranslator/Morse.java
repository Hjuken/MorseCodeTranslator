package MorseCodeTranslator;

import java.util.HashMap;

public class Morse {
    HashMap<String,String> morseToLetters = new HashMap<>();
    public Morse(){
        //Konstruktorn för klassen Morse
        morseToLetters.put("*-","A");
        morseToLetters.put("-***","B");
        morseToLetters.put("-*-*","C");
        morseToLetters.put("-**","D");
        morseToLetters.put("*","E");
        morseToLetters.put("**-*","F");
        morseToLetters.put("--*","G");
        morseToLetters.put("****","H");
        morseToLetters.put("**","I");
        morseToLetters.put("*---","J");
        morseToLetters.put("-*-","K");
        morseToLetters.put("*-**","L");
        morseToLetters.put("--","M");
        morseToLetters.put("-*","N");
        morseToLetters.put("---","O");
        morseToLetters.put("*--*","P");
        morseToLetters.put("--*-","Q");
        morseToLetters.put("*-*","R");
        morseToLetters.put("***","S");
        morseToLetters.put("-","T");
        morseToLetters.put("**-","U");
        morseToLetters.put("***-","V");
        morseToLetters.put("*--","W");
        morseToLetters.put("-**-","X");
        morseToLetters.put("-*--","Y");
        morseToLetters.put("--**","Z");
        morseToLetters.put("*----","1");
        morseToLetters.put("**---","2");
        morseToLetters.put("***--","3");
        morseToLetters.put("****-","4");
        morseToLetters.put("*****","5");
        morseToLetters.put("-****","6");
        morseToLetters.put("--***","7");
        morseToLetters.put("---**","8");
        morseToLetters.put("----*","9");
        morseToLetters.put("-----","0");
        morseToLetters.put("*-*-*-",".");
        morseToLetters.put("--**--",",");
        morseToLetters.put("**--**","?");
        morseToLetters.put("-*-*--","!");
    }
    public String getLettersFromMorse(String morse) {
        StringBuilder textResult = new StringBuilder();
        //Skapar StringBuilder objektet
        // 'textResult', som kommer bygga upp vårt resultat med engelska bokstäver.

        String [] morseWords = morse.trim().split("\\s+/\\s+");
        //Array för ord. Identifierar hur många ord i input med hjälp av regex /

        for (int i = 0; i <morseWords.length; i++){
            //en vanlig for-loop som går igenom antalet morse-ord från array morseWords
            String morseWord = morseWords[i];
            //Delar upp meningen i ett och ett ord (morseWord), ord 1 = index 0 osv.
            String[] morseLetters = morseWord.split("\\s+");
            //Array för bokstäver. Identifierar hur många olika morse-bokstäver som finns med hjälp av regex

            for (int j = 0; j < morseLetters.length; j++){
                String morseLetter = morseLetters[j];
                String letter = morseToLetters.getOrDefault(morseLetter,"Not correct morse code. Try again!");
                //Array morseLetters innehåller morseordets tecken, vår for-loop går igenom Hashmapen
                // och hittar motsvarande engelska bokstäver get, eller orDefault om det inte matchar.

                textResult.append(letter);
                //Den engelska texten läggs till i objektet 'textResult' (StringBuilder).
            }
            textResult.append(" ");
            //efter varje engelskt ord läggs mellanrum till.
        }
        //Efter varje avslutat ord så fortsätter min första for-loop gå igenom nästa ord.

        return textResult.toString().trim();
        //resultatet omvandlas till en vanlig String
        //trim tar bort eventuella mellanslag före och efter strängen?.
    }

}

