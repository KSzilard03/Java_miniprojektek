import java.util.Scanner;

public class Feladat2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Adja meg a feldolgozásra szánt szót: ");
        String word = input.nextLine();

        StringBuilder newWord = new StringBuilder(word);

        for (int i = 0; i < newWord.length(); i++) {

            if (newWord.charAt(i) == 'a') {

                newWord.setCharAt(i,'*');

            }

        }

        System.out.println("Az új szó módosított karakterekkel: " + newWord);

    }

}
