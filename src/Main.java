import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println("reverseArr(arr) = " + Arrays.toString(reverseArr(arr)));
    }

    private static int[] reverseArr(int[] arr) {
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = arr[reverseArray.length - i - 1];
        }
        return reverseArray;
    }

}