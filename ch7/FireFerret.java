public class FireFerret extends AbstractAnimal {
   
    public FireFerret() {
        super("The Fire Nation", "Fire Ferret", "*squeaks adorably*");
    }

    public void roam(int minutes) {

        // Fire Ferrets get less hungry.
        setHunger(getHunger() + 30 * minutes);

        System.out.println("*dashes around the pro-bending arena*");
    }
}
