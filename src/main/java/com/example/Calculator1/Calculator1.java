package com.example.Calculator1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exit = "";
        while (!exit.equals("exit")) {
            int num1 = getInput("첫 번째 값을 입력하세요.", sc);
            int num2 = getInput("두 번째 값을 입력하세요", sc);

            String operator = getOperator(sc);

            double result = calculate(sc, operator, num1, num2);

            System.out.println("계산 결과 : " + num1 + " " + operator + " " + num2 + " = " + result);

            //종료 값
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();

        }
    }

    // 입력값 받는 메소드
    private static int getInput(String prompt, Scanner sc) {
        while (true) {
            try {
                System.out.println(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력값 입니다. \n다시 입력해 주세요.");
                sc.next();
            }
        }
    }

    // 연산기호 받는 메소드
    private static String getOperator(Scanner sc) {
        while (true) {
            System.out.println("사칙 연산 기호를 입력하세요");
            String operator = sc.next();
            if (checkOperator(operator)) {
                return operator;
            } else {
                System.out.println("잘못된 사칙연산 기호를 입력했습니다.\n다시 기호를 입력하세요.");
            }
        }
    }

    private static boolean checkOperator (String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

    private static double calculate(Scanner sc,String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                while (num2 == 0) {
                    num2 = getInput("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. \n두번째 정수를 다시 입력하세요.", sc);
                }
                return (double) num1 / num2;
            default:
                return 0;
        }
    }
}

