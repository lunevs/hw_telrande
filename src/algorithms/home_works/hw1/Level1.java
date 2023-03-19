package algorithms.home_works.hw1;

import java.util.Arrays;

public class Level1 {

    //Level 1
    //Найти индекс заданного числа в массиве: {3, 6, 4, 7, 2, 1, 9}
    //Алгоритм на вход должен получать любой массив и одну цифру, индекс которой требуется найти.
    //Задание считается выполненным если: использован ”Линейный подход” и алгоритм соответствует характеристикам алгоритма и выдает верный результат.

    public static int FindIndex(int[] arr, int findElement) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findElement) {
                return i;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] myArr = {3, 6, 4, 7, 2, 1, 9};
        System.out.println("Input arr: " + Arrays.toString(myArr));
        int resIndex = FindIndex(myArr, 7);
        System.out.println("Search element: 7");
        System.out.println("Result index: " + resIndex);


    }
}
