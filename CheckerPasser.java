/*
Program made by EzyMykola

https://github.com/EzyMykola
*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckerPasser{
            public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double g1, g2, g3, sum, average;
        String statement = "This is your general average: ";
        
        
        System.out.println("Welcome to CheckerPasser, to determine whether you passed or not");
        System.out.println("       Only three grade input to compute the average :>         ");
            System.out.println("                Made by: EzyMykola.                         ");
        
        System.out.println("Enter first grade: ");
        g1 = sc.nextDouble();

        System.out.println("Enter second grade: ");
        g2 = sc.nextDouble();

        System.out.println("Enter third grade: ");
        g3 = sc.nextDouble();

        sum = g1 + g2 + g3;
        average = sum/3;


            String formatave = df.format(average);
            
        
        System.out.print(statement + formatave);

        if (average<70||average>100){
           System.out.println(" (Out of Range.)"); 
        }

            else if (average>=71&&average<=74 ){
            System.out.println(" {Sorry, you have failed.)");
            }

            else if (average>=75&&average<=79){
            System.out.println(" (Seems fair.)");
            }

            else if (average>=80&&average<=84){
            System.out.println(" (Satisfactory.)");
            }

            else if (average>=85&&average<=89){
            System.out.println(" (Very Satisfactory)");
            }
        
            else if (average>=90&&average<=100){
            System.out.println(" (Outstanding)");
         }
        }

    }
