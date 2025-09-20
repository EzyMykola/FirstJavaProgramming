/*
Program made by EzyMykola

https://github.com/EzyMykola
*/

import java.util.Scanner;

public class ForLoopProblem{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);

    int evennum;

    System.out.println("Please input even numbers only. Ex: 2,4,6,8,10, ...");
    evennum = sc.nextInt();

    for(int i = evennum; i<=50; i +=2 ) {

        System.out.println(i);

    }
    }
}

