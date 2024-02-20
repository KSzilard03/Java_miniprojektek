import java.util.Scanner;

public class Feladat5 {

    public static boolean StringAlphabeticTest(String str) {

        if (str == null || str.isEmpty()) {

            return false;

        }

        for (char c: str.toCharArray()) {

            if (!Character.isLetter(c)) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Adja meg a stringet: ");
        String str = input.nextLine();

        if (StringAlphabeticTest(str)) {

            System.out.println("A beolvasott string csak alfabetikus!");

        }

        else {

            System.out.println("A beolvasott string nem csak alfabetikus");

        }

    }

}
