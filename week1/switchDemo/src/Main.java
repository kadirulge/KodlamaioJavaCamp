public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Perfect:You Passed");
                break;
            case 'B':
            case 'C':
                System.out.println("Fine:You Passed");
                break;
            case 'D':
                System.out.println("Not Bad:You Passed");
                break;
            case 'F':
                System.out.println("Unfortunately You Failed");
                break;
            default:
                System.out.println("You Entered an Invalid Grade");
        }
    }
}
