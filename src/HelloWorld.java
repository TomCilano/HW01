import java.util.Scanner;

/**
 * Created by Tom on 9/6/16.
 */
public class HelloWorld {
    public static void main(String[] args) {



        System.out.println("What is your name");
        Scanner name = new Scanner(System.in);
        String x = name.next();
        System.out.println("Ok, " + x);



        System.out.print(x + "...How old are you?");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println("So you're " + n + " years old");


        System.out.println("What is your e-mail address?");
        Scanner email = new Scanner(System.in);
        String y = name.next();
        System.out.println("Ok your email address is: ");
        System.out.println(y);
        System.out.println("Thanks for all the info");


        }
    }

