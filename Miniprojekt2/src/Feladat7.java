public class Feladat7 {

    public static void main(String[] args) {

        int[] array = {5, 4, 4, 2, 2, 4, 1, 1, 3};

        for (int i = 0; i < array.length; i++) {

            int count = 0;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    count++;

                }

            }

            if (count >= 1) {

                System.out.println(array[i] + " elem előfordult " + (count + 1) + " alkalommal");

            }

        }

    }

}
