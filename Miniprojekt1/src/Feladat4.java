import java.util.Scanner;

public class Feladat4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n=");
        int number = input.nextInt();
        String stars = "";

        for (int i = 1; i <= number; i++) {

                stars = stars + "*";
                System.out.println(stars);

        }

    }

}
