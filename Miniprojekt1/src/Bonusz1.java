import java.util.Scanner;

public class Bonusz1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Válasszon a lehetőségek közül:");
        System.out.println("1. Pohár nélkül");
        System.out.println("2. Dupla cukorral");
        System.out.println("3. Habos kávé");

        int choice = input.nextInt();
        int price = 250;

        switch (choice) {

            case 1: {

                System.out.println("Kávé pohár nélkül kiválasztva.");
                price -= 10;
                break;

            }

            case 2: {

                System.out.println("Kávé dupla cukorral kiválasztva.");
                price += 20;
                break;

            }

            case 3: {

                System.out.println("Kávé habbal kiválasztva.");
                price += 50;
                break;

            }

            default: {

                System.out.println("Helytelen bevitel!");
                input.close();
                return;

            }

        }

        System.out.println("A kávé ára: " + price + " Ft.");

        System.out.print("Befizetés: ");
        int payment = input.nextInt();
        System.out.println("Befizetett összeg: " + payment);

        int change = payment - price;

        while (payment != price) {

            if (payment < price) {

                int difference = price - payment;
                System.out.println("Nem fizetett be elegendő összeget: " + price + ", " + difference + " Ft hiányzik.");
                System.out.print("Befizetés: ");
                payment += input.nextInt();
                change = payment - price;

            }

            if (payment > price) {

                break;

            }

        }

        System.out.println("Köszönjük, hogy minket választott! Visszajáró: " + change + " Ft.");
        input.close();

    }

}
