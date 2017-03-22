import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> locationCells = new ArrayList<Integer>();
    int numHits = 0;

    public void setLocationCells(ArrayList<Integer> cells) {
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

            // Handle a hit. 
            if (guess == cell) {
                result = "hit";
                locationCells.remove(locationCells.indexOf(cell));
                numHits++;
                break;
            }
        }

        // Check for a kill.

        if (locationCells.size() == 0) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}
