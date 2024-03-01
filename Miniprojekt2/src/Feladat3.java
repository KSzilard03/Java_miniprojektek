import java.util.Scanner;

public class Feladat3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Adja meg a feldolgozásra szánt karakterláncot: ");
        String word = input.nextLine();

        StringBuilder newWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            char actualLetter = word.charAt(i);

            if (word.indexOf(actualLetter, i + 1) == -1) {

                newWord.append(actualLetter);

            }

        }

        System.out.println("Az új karakterlánc: " + newWord);

    }

}
