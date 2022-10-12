public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);

        }
        System.out.println("For loop is finished");

        int i = 2;
        // While loop
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While loop is finished");

        // Do-While
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        }
        while (j < 10);
        System.out.println("Do-While loop is finished");

    }
}
