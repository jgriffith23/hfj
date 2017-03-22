public class SimpleDotCom {
    private int[] locationCells;
    int numHits = 0;

    public void setLocationCells(int[] cells) {
        locationCells = cells;
    }

    public String checkYoSelf(String userGuess) {

        // Convert the String guess into an int
        int guess = Integer.parseInt(userGuess);

        // Make a var to hold the result to return. Assume the user's
        // aim is lousy.
        String result = "miss";

        // Check each cell against the user's guess.

        for (int cell : locationCells) {

            // Handle a hit. Should we be using a private setter or
            // other private method for accessing numHits?

            if (guess == cell) {
                result = "hit";
                numHits++;
                break;
            }
        }

        // Check for a kill.

        if (numHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}
