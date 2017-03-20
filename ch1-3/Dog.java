public class Dog {
    String name;

    public static void main (String[] args) {
        // Make a Dog object and access it.
        Dog fido = new Dog();

        // Fido doesn't have a name yet! It's null.
        fido.bark();
        fido.name = "Fido";

        // Make a Dog array (an array of references that can refer
        // to Dog objects).
        Dog[] cuteDogs = new Dog[3];

        // Instantiate some Dog objects and use the references in the Dog
        // array to refer to them.

        cuteDogs[0] = new Dog();
        cuteDogs[1] = new Dog();
        cuteDogs[2] = fido;

        // Access the Dog objects using the array references.

        cuteDogs[0].name = "Fluffy";
        cuteDogs[1].name = "Arfy";

        // Hmm...what's cuteDogs[2]'s name?
        System.out.print("Last dog's name is: ");
        System.out.println(cuteDogs[2].name);

        // Iterate over array and tell all dogs to bark.

        int i = 0;
        while(i < cuteDogs.length) {
            cuteDogs[i].bark();
            i = i + 1;
        }

    }

    public void bark() {
        System.out.println(name + " says Woof Woof! *slobber*");
    }

    public void eat() {
        System.out.println("nomnomnom");
    }

    public void chaseCat() {
        System.out.println("where's da cat where's da cat?");
    }

}
