public class Main {
    public static void main(String[] args) {
        String message = "  the weather is so nice today ^,^  ";
        System.out.println(message);

        /*
         * System.out.println("Number of elements : " + message.length());
         * System.out.println("5. element:" + message.charAt(4));
         * System.out.println(message.concat(" Yippee!"));
         * System.out.println(message.startsWith("t"));
         * System.out.println(message.endsWith(".")); char[] characters = new char[5];
         * message.getChars(0, 5, characters, 0); System.out.println(characters);
         * System.out.println(message.indexOf("at"));
         * System.out.println(message.lastIndexOf("r"));
         */

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
