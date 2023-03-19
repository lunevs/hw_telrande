package algorithms.home_works.hw1;

import java.util.Arrays;

public class Level2 {

    //Level 2
    //Реализовать алгоритм, который будет находить сумму квадратов всех элементов массива!  {3, 6, 4, 7, 2, 1, 9}
    //Задание считается выполненным если: использован ”Линейный подход” и алгоритм соответствует характеристикам алгоритма и выдает верный результат.
    public static int CalcSquareSum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int[] myArr = {3, 6, 4, 7, 2, 1, 9};
        System.out.println("Input arr: " + Arrays.toString(myArr));
        int resSum = CalcSquareSum(myArr);
        System.out.println("Result: " + resSum);

    }
}
