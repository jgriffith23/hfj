class Book {
    String title;
    String author;
}

class BookTestDrive {
    public static void main(String[] args) {

        Book[] bookShelf = new Book[4];
        int i = 0;

        bookShelf[0] = new Book();
        bookShelf[1] = new Book();
        bookShelf[2] = new Book();
        bookShelf[3] = new Book();

        bookShelf[0].title = "The Hitchhiker's Guide to the Galaxy";
        bookShelf[1].title = "The Lord of the Rings";
        bookShelf[2].title = "Neuromancer";
        bookShelf[3].title = "Mistborn";

        bookShelf[0].author = "Douglas Adams";
        bookShelf[1].author = "J.R.R. Tolkien";
        bookShelf[2].author = "William Gibson";
        bookShelf[3].author = "Brandon Sanderson";

        System.out.println("Books on my shelf: ");

        while (i < 4) {
            System.out.print(bookShelf[i].title);
            System.out.print(" by ");
            System.out.println(bookShelf[i].author);

            i = i + 1;

        }
    }
}
