/*
Program made by EzyMykola

https://github.com/EzyMykola
*/

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number, guess;
        number = r.nextInt(1, 10);

        System.out.println("               Welcome to Random Number Game          ");
        System.out.println("             Guess the number between 1 to 10         ");
        System.out.println("                    Made by: EzyMykola                ");

        System.out.println("Guess?: ");
        guess = sc.nextInt();


        

            if (guess == number) {
                System.out.println("You Passed :>");
            }
            else{
                System.out.println("You Failed :<");
            }


        System.out.println("Random number: " + number);
        System.out.println("Guess??: " + guess);

    




    }
}