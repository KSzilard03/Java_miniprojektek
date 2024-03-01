public class Feladat8 {

    public static void main(String[] args) {

        int[] array = {5, 4, 6, 7, 2, 1, 8};

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    int actual = array[i];
                    array[i] = array[j];
                    array[j] = actual;

                }

            }

        }

        System.out.print("A növekvő sorrendbe rendezett tömb: ");

        for (int element: array) {

            System.out.print(element + " ");

        }

    }

}
