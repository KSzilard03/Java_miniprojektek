public class Feladat9 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {

            array[i][i] = i + 1;

        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (i != j) {

                    array[i][j] = 0;

                }

            }

        }

        for (int[] row : array) {

            for (int num: row) {

                System.out.print(num + " ");

            }

            System.out.println();

        }


    }

}
