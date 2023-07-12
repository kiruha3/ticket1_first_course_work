import java.lang.reflect.Array;
import java.util.Arrays;

//- Задача
//
//        Напишите метод , который разворачивает исходный массив.
//
//        Ожидаемый результат: метод принимает на вход массив и возвращает на выходе массив такой же длины, но с элементами в противоположном порядке от исходного
//
//        Пример:
//
//        на входе - {1, 2 ,3}
//
//        на выходе - {3, 2, 1}- Задача
//
//        Напишите метод , который разворачивает исходный массив.
//
//        Ожидаемый результат: метод принимает на вход массив и возвращает на выходе массив такой же длины, но с элементами в противоположном порядке от исходного
//
//        Пример:
//
//        на входе - {1, 2 ,3}
//
//        на выходе - {3, 2, 1}
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