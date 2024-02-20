import java.util.Scanner;
import java.util.Random;

public class Bonusz2 {

    public static void randomGame() {

        Random random = new Random();
        Scanner tippInput = new Scanner(System.in);

        int count = 1;
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Egy véletlenszerű szám generálódott 1 és 100 között!");

        System.out.println("Tippeljen:");
        int tipp = tippInput.nextInt();

        while (tipp != randomNumber) {

            if (tipp < randomNumber) {

                System.out.println("A generált szám nagyobb!");
                tipp = tippInput.nextInt();
                count++;

            }

            if (tipp > randomNumber) {

                System.out.println("A generált szám kisebb!");
                tipp = tippInput.nextInt();
                count++;

            }

        }

        System.out.println("Gratulálok! Eltalálta a számot: " + randomNumber + ", tippelések száma: " + count);

        tippInput.close();

    }

    public static void main(String[] args) {

        Scanner choiceInput = new Scanner(System.in);

        System.out.println("Szeretnél új játékot kezdeni? (igen/nem)");

        String choice = choiceInput.nextLine().toLowerCase();

        boolean play;

        play = choice.equals("igen");

        if (play) {

            randomGame();

        }

        else if (choice.equals("nem")) {

            System.out.println("Köszönöm a játékot! Viszlát!");

        }

        else {

            System.out.println("Helytelen bevitel!");

        }

        choiceInput.close();

    }

}
