 public class SimpleDotComTestDrive {

     // Following along, but at this point, the example code does not
     // test for misses or kills. We should test for those, too.

     public static void main (String[] args) {

         // Instantiate a SimpleDotCom object
         SimpleDotCom tweeter = new SimpleDotCom();
         
         // Make int Array to contain the dotcom
         int [] cells = {2, 3, 4};

         // Invoke setter method to set location cells
         tweeter.setLocationCells(cells);

         // Make a fake guess
         String userGuess = "2";

         // Invoke checkYoSelf() on the object and pass it the fake guess
         String result = dot.checkYoSelf(userGuess);

         // Assume failure
         String testResult = "failed";

         // 2 is one of the cells, so the string "hit" should be bound to
         // result. If it is, we have passed.

         if result.equals("hit") {
                 testResult = "passed";
         }

         System.out.println(testResult);
     }
 }
