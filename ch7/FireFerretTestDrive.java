public class FireFerretTestDrive {

    public static void main (String[] args) {
        FireFerret pabu = new FireFerret();
        pabu.setName("Pabu");
        pabu.setPreferredFood("Fire Ginger Cookies");

        pabu.greet();
        System.out.println("I'm this hungry: " + pabu.getHunger());
        
        pabu.roam(10);
        System.out.println("What a workout! Now I'm this hungry: " + pabu.getHunger());

        pabu.eat(350);
        System.out.println("OMNOMNOM~ Now I'm this hungry: " + pabu.getHunger());

        pabu.sleep();
    }
}
