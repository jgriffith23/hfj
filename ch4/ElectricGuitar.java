class ElectricGuitar {

    // Instance variables

    String brand;
    int numPickups;
    boolean rockStarUsesIt;

    // Methods

    // A getter
    String getBrand()
    {
        return brand;
    }

    // A setter
    void setBrand(String aBrand) {
        brand = aBrand;
    }

    // Notice how the getters have types other than void.

    int getNumPickups() {
        return numPickups;
    }

    void setNumPickups(int num) {
        numPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

    void displayInfo() {
        String guitarInfo = String.format("Brand: %s, Pickups: %s, In Use? %s",
                                          getBrand(),
                                          getNumPickups(),
                                          getRockStarUsesIt());

        System.out.println(guitarInfo);
    }

    public static void main(String []args) {
        ElectricGuitar redSpecial = new ElectricGuitar();
        redSpecial.setBrand("Red Special");
        redSpecial.setNumPickups(3);
        redSpecial.setRockStarUsesIt(true);
        redSpecial.displayInfo();
    }
}
