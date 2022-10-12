public class Main {
    public static void main(String[] args) {
        char letter = 'I';

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Short Vowel");
                break;
            default:
                System.out.println("Long Vowel");

        }

    }
}
