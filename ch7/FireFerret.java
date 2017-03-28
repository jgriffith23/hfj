public class FireFerret extends AbstractAnimal {
   
    public FireFerret() {
        nativeHabitat = "The Fire Nation";
        species = "Fire Ferret";
        noiseItMakes = "Squeak, squeak, where's Bolin?";
    }

    public void roam(int minutes) {

        // Fire Ferrets get less hungry.
        hunger = hunger + 30 * minutes;

        System.out.println("*dashes around the pro-bending arena*");
    }
}
