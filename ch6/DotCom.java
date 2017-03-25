import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> cells) {
        locationCells = cells;
    }

    public void setName(String passedName) {
        name = passedName;
    }

    public String getName() {
        return name;
    }

    public String checkYoSelf(String userGuess) {

        // Make a var to hold the result to return. Assume the user's
        // aim is lousy.
        String result = "miss";

        int index = locationCells.indexOf(userGuess);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {

                // FIXME: I really don't like that the DotCom handles
                // the kill output for a guess, and DotComBust handles
                // the result type output. Kill output should be on DotComBust.
                result = "kill";
                System.out.println("Another one bites the dust...");
                System.out.println("You sunk " + name + "!");
            }

            else {
                result = "hit";
            }
        }

        return result;
    }
}
