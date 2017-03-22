import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells = new ArrayList<String>();
    int numHits = 0;

    public void setLocationCells(ArrayList<String> cells) {
        locationCells = cells;
    }

    public String checkYoSelf(String userGuess) {

        // Make a var to hold the result to return. Assume the user's
        // aim is lousy.
        String result = "miss";

        int index = locationCells.indexOf(userGuess);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            }

            else {
                result = "hit";
            }
        }

        System.out.println(result);

        return result;
    }
}
