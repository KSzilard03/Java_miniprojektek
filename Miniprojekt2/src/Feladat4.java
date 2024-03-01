import java.util.Scanner;

public class Feladat4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Adja meg a feldolgozásra szánt karakterláncot: ");
        String word = input.nextLine();

        StringBuilder newWord = new StringBuilder();
        int count = 1;

        for (int i = 0; i < word.length(); i++) {

            if (i + 1 < word.length() && word.charAt(i) == word.charAt(i + 1)) {

                count ++;

            }

            else {

                newWord.append(word.charAt(i));

                if (count >= 2) {

                    newWord.append(count);

                }

                count = 1;

            }

        }

        System.out.println("Az új karakterlánc: " + newWord);

    }

}
