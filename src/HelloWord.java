import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        String message = "Hello World!";

        System.out.println(message);
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Year of Birthday" );
        int year = sc.nextInt();
        System.out.println("Your Birthday is " + year);


    }
}
