package pr1.first.task.pr1;

public class TestBall {
    public static void main(String[] args) {
        Ball B1 = new Ball("Red", "wood", "soccer", true);
        Ball B2 = new Ball("Green", "metal", "golf", false);
        Ball B3 = new Ball("Yellow", "plastic", "basketball", true);

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);

        B1.setColor("Black");
        B2.setMaterial("Latex");
        B3.setInAir(false);

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);
    }
}
