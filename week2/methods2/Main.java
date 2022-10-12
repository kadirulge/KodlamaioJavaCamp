public class Main {
    public static void main(String[] args) {
        String message ="the weather is so nice today.";
        String newMessage = assignCity();
        System.out.println(newMessage);
        int num = sum(15,7);
        System.out.println(num);
        int sum = add2(2,3,4);
        System.out.println(sum);
    }

    public  static  void add(){
        System.out.println("Added");
    }

    public static void delete (){
        System.out.println("Deleted");
    }

    public static void update(){
        System.out.println("Updated");
    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }

    public static int add2(int... numbers) {
        int sum = 0;
        for (int num:numbers){
            sum += num;
        }
        return sum;
    }
    public static String assignCity(){
        return "Ankara";
    }
}
