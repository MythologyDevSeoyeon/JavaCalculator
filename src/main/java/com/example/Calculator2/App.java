package com.example.Calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //객체 생성
            Calculator2 calculator = new Calculator2();

            System.out.println("첫번째 숫자를 입력하세요");
            double num1 = sc.nextDouble();

            System.out.println("두번째 숫자를 입력하세요");
            double num2 = sc.nextDouble();

            System.out.println("연산 기호를 입력하세요");
            String operator = sc.next();

            while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                System.out.println("잘못된 연산 기호를 입력했습니다.\n다시 입력하세요");
                operator = sc.next();
            }

            while (operator.equals("/") && num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.\n두번째 숫자를 다시 입력해주세요 : ");
                num2 = sc.nextInt();
            }

            double result = calculator.calculate(num1, num2, operator);
            calculator.saveResult(result);

            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("종료하시겠습니까? exit 입력 시 종료");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.exit(0);
            }
        }
    }
}