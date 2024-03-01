public class Feladat6 {

    public static void main(String[] args) {

        int[] array = {5, 4, 2, 1, 3};
        int min = array[0];
        int max = 0;


        for (int i : array) {

            if (i > max) {

                max = i;

            }

            if (i < min) {

                min = i;

            }

        }

        System.out.println("A tömb legkisebb eleme: " + min);
        System.out.println("A tömb legnagyobb eleme: " + max);

    }

}
