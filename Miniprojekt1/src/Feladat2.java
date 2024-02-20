import java.util.Scanner;

public class Feladat2 {

    public static Boolean CheckPassword(String password) {

        return password.equals("jelszo123");

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean result = false;
        int count = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Adja meg a jelszavát:");
            String passwordInput = input.nextLine();
            result = CheckPassword(passwordInput);

            if (!result) {

                System.out.println("Helytelen jelszó!");
                count++;

                if (count == 3) {

                    System.out.println("Sikertelen bejelentkezés!");

                }

            }

            else {

                System.out.println("Sikeres bejelentkezés!");
                break;

            }

        }

        input.close();

    }

}
