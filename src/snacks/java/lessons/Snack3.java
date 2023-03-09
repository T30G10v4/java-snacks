package snacks.java.lessons;

public class Snack3 {
    public static void main(String[] args) {

        int sum = 0;

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {

            if(i%2!=0) sum+=numbers[i];

        }

        System.out.println("La somma è "+sum);

    }
}
