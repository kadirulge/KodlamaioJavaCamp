public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int toFind = 5;
        boolean isThere = false;
        for (int num : numbers) {
            if (num == toFind) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            System.out.println("Number is there");
        } else {
            System.out.println("Number is not there");
        }
    }
}
