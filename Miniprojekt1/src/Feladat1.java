import java.util.Scanner;

public class Feladat1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adjon meg egy egész számot, mely 1 és 10 között van:");
        int number = input.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("A szám nem 1 és 10 közötti egész szám!");
        }

        else {

            for (int i = 1; i <= 10; i++) {

                System.out.println(number + "x" + i + "=" + (number * i));

            }

        }

    }

}
