import java.util.Arrays;

public class Feladat5 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};


        int firstElement = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstElement;

        System.out.println("A tömb az első és utolsó elem cseréje után: " + Arrays.toString(array));

    }

}
