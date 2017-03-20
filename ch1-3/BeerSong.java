public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";
        String fragmentOne = "of beer on the wall";
        String fragmentTwo = "of beer";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + fragmentOne);
            System.out.println(beerNum + " " + word + fragmentTwo);

            System.out.println("Take one down, pass it around!");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + fragmentOne);
            }
        }


        System.out.println("No more bottles of beer on the wall!");
    }
}
