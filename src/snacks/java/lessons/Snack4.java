package snacks.java.lessons;

import java.util.Random;

import static java.lang.Math.random;

public class Snack4 {

    public static void main(String[] args) {
        int[] array1 = {3,6,9,12,15,18,21,24};
        int[] array2 = {10,20,30,40,50};

        int arrayChoosing = 0;
        int numberChoosing = 0;
        int number;

        Random rnd = new Random();

        for (int i = 0; (array2.length+i)<array1.length; i++) {
            arrayChoosing = rnd.nextInt(2);
            if(arrayChoosing == 0)
            {
                numberChoosing = rnd.nextInt(array1.length);
                number = array1[numberChoosing];

            }
            else
            {
                numberChoosing = rnd.nextInt(array2.length);
                number = array2[numberChoosing];
            }

            System.out.println(number);

        }

    }

}
