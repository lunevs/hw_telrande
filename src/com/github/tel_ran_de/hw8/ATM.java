package com.github.tel_ran_de.hw8;

import java.util.Scanner;

public class ATM {

    public static int AMOUNT_LIMIT = 10000;
    public static int DAY_OPERATIONS_LIMIT = 5;
    public static int INCOME_AMOUNT = 100000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int currentOperationsCounter = 1;
        int myMoney = INCOME_AMOUNT;
        int currentOperationAmount;

        while (true) {
            System.out.println("ваш текущий остаток: " + myMoney);
            System.out.println("сколько денег вы хотите снять? (для выхода укажите - 0)");
            currentOperationAmount = sc.nextInt();

            if (currentOperationAmount == 0) {
                break;
            } else if (currentOperationsCounter > DAY_OPERATIONS_LIMIT) {
                System.out.println("превышен лимит на количество операций");
                break;
            } else if (currentOperationAmount > AMOUNT_LIMIT) { // превышен  лимит операции
                System.out.println("превышена сумма максимальной операции. Укажите другую");
            } else { // все ок, снимаем
                currentOperationsCounter += 1;
                myMoney -= currentOperationAmount;
            }
        }
    }
}
