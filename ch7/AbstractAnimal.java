public class AbstractAnimal {
    private String nativeHabitat;
    private String species;
    private String name;
    private String noiseItMakes;
    private String preferredFood;
    private int hunger = 0;

    public AbstractAnimal(String passedNativeHabitat,
                          String passedSpecies,
                          String passedNoiseItMakes) {
        nativeHabitat = passedNativeHabitat;
        species = passedSpecies;
        noiseItMakes = passedNoiseItMakes;
    }

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

    public void setHunger(int newHunger) {
        hunger = newHunger;
    }

    public void greet() {
        String greeting = "Hi, I'm " + name + " the " + species + "!";
        System.out.println(greeting);
        System.out.println(noiseItMakes);
    }

    public void eat(int calories) {
        int newHunger = getHunger() - calories;

        setHunger(newHunger);
    }

    public void sleep() {
        System.out.println("Zzzzzzz...");
    }

    public void roam(int minutes) {

        // Let's say an animal craves 50 more calories
        // per minute it roams...
        int newHunger = getHunger() + 50 * minutes;

        setHunger(newHunger);

        System.out.println("*frolic frolic woot!*");
    }
}
