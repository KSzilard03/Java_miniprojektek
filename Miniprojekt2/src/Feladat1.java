import java.util.Scanner;

public class Feladat1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Adja meg a feldolgozásra szánt szót: ");
        String word = input.nextLine();

        if (word.isEmpty()) {

            System.out.println("Az ön által megadott mező üres!");

        }

        else {

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);

            System.out.println("Az ön által megadott szó első karaktere: " + firstLetter);
            System.out.println("Az ön által megadott szó utolsó karaktere: " + lastLetter);

        }

    }

}
