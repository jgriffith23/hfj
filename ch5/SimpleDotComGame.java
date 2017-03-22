public class SimpleDotComGame {

    public static void main (String[] args) {
        int numGuesses = 0;
        SimpleDotCom ubermelon = new SimpleDotCom();

        // Pick random starting location and assign the
        // dot com's location cells. Hard coded for now.

        int start = 2;
        int [] cells = {start, start + 1, start + 2};
        ubermelon.setLocationCells(cells);

        // State variable; when this is false, the dot com is dead, Jim.
        boolean isAlive = true;

        // As long as the dot com isn't dead, keep getting and checking
        // the user's guesses. For now, I'm hard coding; need to get
        // from cmd line.

        String userGuess;
        String result;
        while (isAlive == true) {
            userGuess = "2";
            numGuesses++;

            result = ubermelon.checkYoSelf(userGuess);

            if (result == "kill") {
                isAlive = false;
                System.out.println(numGuesses);
            }
        }
    }
}
