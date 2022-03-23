import java.util.ArrayList;
import java.util.Random;

public class RandomCharacter {

    Random random;
    ArrayList<String> randomCharList;
    String character;

    public RandomCharacter(){
        // random generator
        random = new Random();
        // store the random generated characters into the arraylist
        randomCharList = new ArrayList<>();
    }

    public String getRandomLowerCaseLetter(){
        // generate one random lower case character between 'a' and 'z'
        character = Character.toString((char) (random.nextInt(26) + 'a'));
        // return the character
        return character;
    }

    public String getRandomUpperCaseLetter(){
        // generate one random upper case character between 'A' and 'Z'
        character = Character.toString((char) (random.nextInt(26) + 'A'));
        // return the character
        return character;
    }

    public String getRandomDigitCharacter(){
        // generate one random digit number between '0' and '9'
        character = Integer.toString(random.nextInt(10));
        // return the character
        return character;
    }

    public ArrayList<String> getRandomCharacter(){
        // loop through 15 times to generated 15 random characters
        for (int i = 0; i < 15; i++){
            // generate one random digit number between '0' to '2'
            int number = random.nextInt(3);

            if (number == 0)        // if number == 0, generate a random lower case character
                character = getRandomLowerCaseLetter();
            else if (number == 1)   // if number == 1, generate a random upper case character
                character = getRandomUpperCaseLetter();
            else                    // if number == 2, generate a random digit number
                character = getRandomDigitCharacter();
            // add the character into the arraylist
            randomCharList.add(character);
        }
        // return the arraylist
        return randomCharList;
    }
}
