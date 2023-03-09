package snacks.java.lessons;

import java.util.Scanner;

public class Snack1 {

    public static void main(String[] args) {

        int number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        number = Integer.parseInt(scan.nextLine());

        if(number %2 ==0) {

            System.out.println("Il numero è " +number);

        }
        else {

            number+=1;
            System.out.println("Il numero è " +number);

        }

        scan.close();

    }



}
