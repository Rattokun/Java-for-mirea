package su.mirea.ru;

public class Functions {

    public static void Task14(int N) {
        if (N / 10 != 0)
            Task14(N / 10);
        System.out.println(N % 10);
    }

    public static void Task12()
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int N = in.nextInt();

        if (N != 0)
        {
            if (N%2 != 0) {
                System.out.println(N);
            }
                Task12();
        }
    }

    public static void Task13()
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int N = in.nextInt();
        if (N != 0) {
            int temp = in.nextInt();
            System.out.println(N);

            if (temp != 0)
                Task13();
        }
    }

}
