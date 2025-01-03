package com.example.Calculator1;
import java.util.Scanner;

public class Calculator1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String exit = "";

        while (!exit.equals ("exit")) {
            System.out.println("첫 번째 값을 입력하세요");
            double num1 = sc.nextInt();

            System.out.println("두 번째 값을 입력하세요");
            double num2 = sc.nextInt();

            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 값만 입력 가능합니다.");
                return;
            }

            System.out.println("사칙 연산 기호를 입력하세요: ");
            String operator = sc.next();

            while(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")){
                System.out.println("잘못된 사칙연산 기호를 입력했습니다.\n다시 기호를 입력하세요.");
                operator = sc.next();
                break;
            }

            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    while (num2 ==0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. \n두번째 정수를 다시 입력하세요.");
                        num2 = sc.nextInt();
                    }
                    result = num1 / num2;
                    break;
                default :
                    break;
            }

            System.out.println("계산 결과 : " + num1 +" "+ operator + " " + num2 + " = " + result);

            //종료 값
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();

        }
    }
}

