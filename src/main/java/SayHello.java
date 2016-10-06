import java.util.Scanner;

/**
 * Created by jumanaalmasri on 10/6/16.
 * Your first task is: "Write a program that asks the user for her name and greets her with her name."
 */


public class SayHello {

    public static void main(String args[]){

        Scanner user_name = new Scanner(System.in);

        System.out.println("Hi there, what is your name?");
        String name= user_name.nextLine();

        System.out.println("Hello "+name);

    }
}
