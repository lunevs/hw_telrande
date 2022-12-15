package com.github.tel_ran_de.lesson11;

//Разработайте калькулятор, вычисляющий произвольное математическое выражение, введенное пользователем с клавиатуры.
//        Выражение включает в себя аргементы и знаки математических операций. Аргументы выражения - положительные числа. Количество аргементов и операций, входящих в состав выражения, не ограничено.
//
//        Уровень 1. Реализовать решение для целых чисел.
//        Пример:
//        18
//        354+3-14
//        10-7+1000+5-2+14
//
//        Уровень 2. Реализовать решение для целых и дробных чисел.
//        Пример:
//        354.5+3-14.3

import java.util.*;

public class Calculator {

    private static final char[] OPERATIONS = {'+', '-', '*', '/', '%'};
    private static final boolean debug = true;

    private static boolean containElement(char element, char[] arrElements) {
        for (char arrElement : arrElements) {
            if (arrElement == element)
                return true;
        }
        return false;
    }

    private static double sumOperation(double a1, double a2, char operation) {
        double res = switch (operation) {
            case '+' -> a1 + a2;
            case '-' -> a1 - a2;
            case '*' -> a1 * a2;
            case '/' -> a1 / a2;
            case '%' -> a1 % a2;
            default -> 0;
        };
        if (debug)
            System.out.println(a1 + " " + operation + " " + a2 + " = " + res);
        return res;
    }

    private static double calc(String inputString) {

        StringBuilder sb = new StringBuilder(inputString);
        double result = 0.;
        String currentOperation = "";
        ArrayList<Double> numbers = new ArrayList<>();
        sb.append("$");
        char currentElement;
        int tmpIdx = 0;

        for(int i=0; i < sb.length(); i++) {
            currentElement = sb.charAt(i);
            if (containElement(currentElement, OPERATIONS) || currentElement == '$') {

                numbers.add(Double.parseDouble(sb.substring(tmpIdx, i)));
                tmpIdx = i;

                if (!currentOperation.equals("")) {
                    double a2 = numbers.remove(numbers.size()-1);
                    double a1 = numbers.remove(numbers.size()-1);
                    result = sumOperation (a1, a2, currentOperation.charAt(0));
                    numbers.add(result);
                }

                currentOperation = sb.substring(tmpIdx, tmpIdx+1);
                tmpIdx++;
            }
        }
        return numbers.remove(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример одной строкой:");
        String inputString = sc.nextLine();
        System.out.println("результат: " + calc(inputString));
    }
}
