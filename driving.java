import java.util.Scanner;

public class driving {
    public static void main(String[] args) {
        System.out.println("this is a program to check a person is eligible for driving or not-->");
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();
        System.out.println("enter the age of a person-->");
        if (age >= 18) {
            System.out.println("you can drive a car");
        } else {
            System.out.println("you can't drive");
        }

    }
}
