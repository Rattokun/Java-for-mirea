package pr1.first.task.pr1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Crime and Lime", 254, "True detective", true);
        Book b2 = new Book("Worst Gatsby", 123, "Roman(empire)", false);
        Book b3 = new Book("Bronze calf", 321, "Comedy gold", true);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.setNumOfPages(228);
        b2.setAvailability(true);
        b1.getAvailability();
        b2.getAvailability();
        b3.setGenre("Void");
        b1.getNumOfPages();
    }
}
