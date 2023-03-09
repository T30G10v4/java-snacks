package snacks.java.lessons;

import java.util.Scanner;

public class Snack2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String[] names = {"John","Mary","Joe","Lisa", "Anne"};
        String[] surnames = {"Smith","McNamara","Helmuth","Patterson", "Johnson"};

        int randomNamePosition = 0;
        int randomSurnamePosition = 0;

        for (int i = 0; i < 10; i++) {

            randomNamePosition = (int)(Math.random()*5);
            randomSurnamePosition = (int)(Math.random()*5);
            System.out.println(names[randomNamePosition] + " " + surnames[randomSurnamePosition]);

        }



        scan.close();

    }



}
