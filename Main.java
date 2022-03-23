import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RandomCharacter rc = new RandomCharacter();
        // retrieve the arraylist that consists of the 15 random generated characters
        ArrayList<String> generatedCharList = rc.getRandomCharacter();
        System.out.println("15 random generated characters: " + generatedCharList);
    }
}
