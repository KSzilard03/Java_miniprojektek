import java.util.Arrays;

public class Feladat6 {

    public static boolean CompareArrays(int[] arr1, int[] arr2) {

        if (arr1 == null || arr2 == null) {

            return false;

        }

        if (arr1.length != arr2.length) {

            return false;

        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2= {1, 2, 3, 4, 5};
        int[] array3 = {2, 1, 3, 5, 4};
        int[] array4 = {1, 2, 5, 4, 5};

        System.out.println("Az első és a második tömb egyenlő - e:" + CompareArrays(array1, array2));
        System.out.println("Az első és a harmadik tömb egyenlő - e:" + CompareArrays(array1, array3));
        System.out.println("A harmadik és a negyedik tömb egyenlő - e:" + CompareArrays(array3, array4));
        System.out.println("A negyedik és az első tömb egyenlő - e:" + CompareArrays(array4, array1));

    }

}
