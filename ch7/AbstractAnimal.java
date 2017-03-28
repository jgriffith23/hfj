public class AbstractAnimal {
    private String nativeHabitat;
    private String species;
    private String name;
    private String noiseItMakes;
    private String preferredFood;
    private int hunger = 0;

    // public AbstractAnimal(String passedNativeHabitat,
    //                       String passedSpecies,
    //                       String passedNoiseItMakes) {
    //     nativeHabitat = passedNativeHabitat;
    //     species = passedSpecies;
    //     noiseItMakes = passedNoiseItMakes;
    // }

    public String getNativeHabitat() {
        return nativeHabitat;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setName(String passedName) {
        name = passedName;
    }

    public void setPreferredFood(String newFood) {
        preferredFood = newFood;
    }

    public void greet() {
        System.out.println(noiseItMakes);
    }

    public void eat(int calories) {
        hunger = hunger - calories;
    }

    public void sleep() {
        System.out.println("Zzzzzzz...");
    }

    public void roam(int minutes) {

        // Let's say an animal craves 50 more calories
        // per minute it roams...
        hunger = hunger + 50 * minutes;

        System.out.println("*frolic frolic woot!*");
    }
}
