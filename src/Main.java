import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] massiv = new int[]{1, 2, 3};
        System.out.println("reverseMassive(massiv) = " + Arrays.toString((reverseMassive(massiv))));
    }

    public static int[] reverseMassive(int[] massiv) {
        int[] reverseMassive = new int[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            reverseMassive[i] = massiv[massiv.length - i - 1];
        }
        return reverseMassive;
    }
}