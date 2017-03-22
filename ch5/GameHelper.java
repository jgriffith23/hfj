import java.io.*;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        // Ooh, they're giving us a try/catch. But not explaining yet. :(

        try {
            BufferedReader is = new BufferedReader(
                new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        }

        catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }
}
