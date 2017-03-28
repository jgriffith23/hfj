public class FireFerretTestDrive {

    public static void main (String[] args) {
        FireFerret pabu = new FireFerret();
        pabu.setName("Pabu");
        pabu.setPreferredFood("Fire Ginger Cookies");

        pabu.greet();
        pabu.roam(10);
        pabu.eat(100);
        pabu.sleep();
    }
}
