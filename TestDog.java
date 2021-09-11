package pr1.first.task.pr1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 4, true);
        Dog d2 = new Dog("Like", 8, true);
        Dog d3 = new Dog("Dike",16, true);
        d1.setAge(1);

        System.out.println(d1);
        d1.Bark();

        d2.setAge(2);
        d3.setAge(3);
        d3.feed(false);

        System.out.println(d2);
        d2.Bark();
        System.out.println(d3);
        d3.Bark();
    }
}
