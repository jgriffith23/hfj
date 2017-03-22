import java.util.ArrayList;

public class SimpleDotComGame {

    public static void main (String[] args) {
        int numGuesses = 0;
        SimpleDotCom ubermelon = new SimpleDotCom();

        ArrayList<String> hitsMade = new ArrayList<String>();

        // Apparently this is a helper class we'll write...
        GameHelper helper = new GameHelper();

        // Pick random starting location and assign the
        // dot com's location cells.

        int start = (int) (Math.random() * 5);
        int [] cells = {start, start + 1, start + 2};
        ubermelon.setLocationCells(cells);

        // State variable; when this is false, the dot com is dead, Jim.
        boolean isAlive = true;

        // As long as the dot com isn't dead, keep getting and checking
        // the user's guesses.

        while (isAlive == true) {
            String userGuess = helper.getUserInput("Enter a number: ");
            boolean alreadyHit = false;

            for (String hit : hitsMade) {
                if (userGuess.equals(hit)) {
                    alreadyHit = true;
                    break;
                }
            }

            if (alreadyHit == false) {

                String result = ubermelon.checkYoSelf(userGuess);

                numGuesses++;
                hitsMade.add(userGuess);

                if (result == "kill") {
                    isAlive = false;
                    System.out.println("You took " + numGuesses + " guesses");
                }
            }

            else {
                System.out.println("Hey, you blew that up already!");
            }
        }
    }
}
