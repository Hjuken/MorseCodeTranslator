package MorseCodeTranslator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMorseCode {

    @Test
    public void testLetterToMorse(){
        //Arrange
        Letters letter = new Letters();
        String input = "A";
        //Expected
        String expected = "*-";
        //Actual
        String actual = letter.getMorseCodeLetter(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testMorseCode(){
        //Arrange
        Morse morse = new Morse();
        String input = "***";
        //Expected
        String expected = "S";
        //Actual
        String actual = morse.getLettersFromMorse(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testMorseCodeWholeWord(){
        //Arrange
        Morse morse = new Morse();
        String input = "-- --- *-* *** *";
        //Expected
        String expected = "MORSE";
        //Actual
        String actual = morse.getLettersFromMorse(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testMorseCodeTwoWords(){
        //Arrange
        Morse morse = new Morse();
        String input = "-- --- *-* *** * / -*-* --- -** *";
        //Expected
        String expected = "MORSE CODE";
        //Actual
        String actual = morse.getLettersFromMorse(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testWrongCharacterAsMorseCode(){
        //Arrange
        Morse morse = new Morse();
        String input = "_";
        //Expected
        String expected = "Not correct morse code. Try again!";
        //Actual
        String actual = morse.getLettersFromMorse(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testLetterToMorseWholeWord(){
        //Arrange
        Letters letter = new Letters();
        //Expected
        String input = "ananas";
        //Expected
        String expected = "*- -* *- -* *- ***";
        //Actual
        String actual = letter.getMorseCodeWord(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testLetterToMorseTwoWords(){
        //Arrange
        Letters letter = new Letters();
        //Expected
        String input = "ananas juice";
        //Expected
        String expected = "*- -* *- -* *- *** / *--- **- ** -*-* *";
        //Actual
        String actual = letter.getMorseCodeWord(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testSmallLetterToMorse(){
        //Arrange
        Letters letter = new Letters();
        String input = "a";
        //Expected
        String expected = "*-";
        //Actual
        String actual = letter.getMorseCodeLetter(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testSpaceAsLetter(){
        //Arrange
        Letters letter = new Letters();
        String input = " ";
        //Expected
        String expected = "Not a correct letter. Try Again!";
        //Actual
        String actual = letter.getMorseCodeLetter(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testMixMorseAndText(){
        //Arrange
        Letters letter = new Letters();
        String input = "mix * with text";
        //Expected
        String expected = "-- ** -**- / Not a correct letter. Try Again! / *-- ** - **** / - * -**- -";
        //Actual
        String actual = letter.getMorseCodeWord(input);
        assertEquals(expected,actual);
    }

}

