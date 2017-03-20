class Hobbit {
    String name;

    public static void main(String[] args) {
        Hobbit[] shireGuys = new Hobbit[4];
        int i = 0;

        String[] names = {"Bilbo Baggins",
                          "Frodo Baggins",
                          "Samwise Gamgee",
                          "Merriadoc Brandybuck"
        };

        while (i < 4) {
            shireGuys[i] = new Hobbit();
            shireGuys[i].name = names[i];

            System.out.print(shireGuys[i].name + " is a ");
            System.out.println("good Hobbit name.");

            i = i + 1;
        }
    }
}
