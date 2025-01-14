package com.example.Calculator2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calculator2 = new Calculator2();

        while (true) {
            int num1 = getInput("첫 번째 값을 입력하세요", sc);
            int num2 = getInput("두 번째 값을 입력하세요", sc);
            String operator = getOperator(sc);

            while (operator.equals("/") && num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                num2 = getInput("두 번째 값을 다시 입력하세요", sc);
            }

            int result = calculator2.calculate(num1, num2, operator);
            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);

            calculator2.saveResult(result);

            // Getter 메소드를 활용한 저장된 값 읽기
            System.out.println("저장된 값: " + calculator2.getResults());

            // 저장된 값 삭제하기
            System.out.println("첫번째 값을 삭제 하겠습니까? yes 입력 시 삭제");
            String remove = sc.next();
            if (remove.equals("yes")) {
                calculator2.removeResult();
                System.out.println("삭제 후 저장된 값: " + calculator2.getResults());
            }

            System.out.println("종료하시겠습니까? exit 입력 시 종료");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.exit(0);
            }
        }
    }


    private static int getInput(String prompt, Scanner sc) {
        while (true) {
            try {
                System.out.println(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력입니다. \n다시 입력해 주세요.");
                sc.next();
            }
        }
    }

    private static String getOperator(Scanner sc) {
        while (true) {
            System.out.println("연산자를 입력하세요");
            String operator = sc.next();
            if (checkOperator(operator)) {
                return operator;
            } else {
                System.out.println("잘못된 연산 기호를 입력했습니다.\n다시 입력하세요");
            }
        }
    }

    private static boolean checkOperator(String operator){
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

}
