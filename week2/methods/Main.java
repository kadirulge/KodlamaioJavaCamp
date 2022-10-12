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
            showMessage("Number is there:"+toFind)  ;
        } else {
            showMessage("Number is not there:"+toFind)  ;
        }
    }
    public static void showMessage(String message) {
        System.out.println(message);
    }
}
