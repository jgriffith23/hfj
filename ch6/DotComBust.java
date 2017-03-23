import java.util.ArrayList;

public class DotComBust {
    // Initialize variables for the game.
    private int numGuesses = 0;
    private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();
    private GameHelper helper = new GameHelper();

    // Method to create three dot coms, name them, give them vc funding and
    // homes, and add them to the grid.

    private void setUp() {
        DotCom tweeter = new DotCom();
        DotCom ubermelon = new DotCom();
        DotCom airbbq = new DotCom();

        tweeter.setName("Tweeter");
        ubermelon.setName("Ubermelon");
        airbbq.setName("Air BBQ");

        dotComs.add(tweeter);
        dotComs.add(ubermelon);
        dotComs.add(airbbq);
        
        System.out.println("Sink all three dot coms!");

        for (DotCom homelessDotCom : dotComs) {
            ArrayList<String> schwankyBuilding = helper.placeDotCom(3);
            homelessDotCom.setLocationCells(schwankyBuilding);
        }

    }

    // Method to process a user's guess and print an appropriate message.

    private void checkGuess(String userGuess) {
        numGuesses++;

        String result = "miss";

        for (DotCom hiddenDotCom : dotComs) {
            result = hiddenDotCom.checkYoSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                dotComs.remove(hiddenDotCom);
                break
            }
        }

        System.out.println("Your guess was a " + result + ".");
    }

    // Method to get user input until we run out of dot coms.

    private void playGame() {
        while (!dotComs.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a number: ");
            checkGuess(userGuess);
        }

        endGame();
    }

    // Method to show a pithy message when the game ends.

    private void endGame() {
        System.out.println("The startup crash has arrived...");
        System.out.println("So much for your stock options. :(");

        System.out.println("It took you " + numGuesses + " guesses.");
    }

    // Method to actually run the game.

    public static void main (String [] args) {
        DotComBust gameDriver = new DotComBust();
        gameDriver.setUp();
        gameDriver.playGame();
    }

}
