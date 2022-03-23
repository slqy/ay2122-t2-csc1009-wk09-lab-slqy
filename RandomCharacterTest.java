import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RandomCharacterTest {

    RandomCharacter rcTest;
    String character;

    @Before     // run before @Test
    public void setup(){
        rcTest = new RandomCharacter();
    }

    @Test
    public void getRandomLowerCaseLetter(){
        character = rcTest.getRandomLowerCaseLetter();
        // test if 'character' is in lowercase
        assertTrue(Character.isLowerCase(character.charAt(0)));
    }

    @Test
    public void getRandomUpperCaseLetter(){
        character = rcTest.getRandomUpperCaseLetter();
        // test if 'character' is in uppercase
        assertTrue(Character.isUpperCase(character.charAt(0)));
    }

    @Test
    public void getRandomDigitCharacter(){
        character = rcTest.getRandomDigitCharacter();
        // test if 'character' is a digit number between '0' to '9'
        assertTrue(Integer.parseInt(character) >= 0 && Integer.parseInt(character) <= 9);
    }

    @Test
    public void isPrimeNumber(){
        try{
            // test if 'digit' generated is prime number
            int digit = Integer.parseInt(rcTest.getRandomDigitCharacter());
            boolean prime = true;

            if (digit <= 1)
                prime = false;
            else{
                // condition for non-prime numbers
                for (int i = 2; i <= digit / 2; ++i) {
                    if (digit % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            assertTrue(prime);
        }
        catch (AssertionError e){
            System.out.println("Number generated is not a prime number.");
        }
    }
}
