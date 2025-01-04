package com.example.Calculator2;
import java.util.ArrayList;

public class Calculator2 {
    //필드 정의
    private final ArrayList<Double> results = new ArrayList<>();
    //사칙연산 메서드
    public double calculate (double num1, double num2, String operator){
        switch (operator) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
            case "/" :
                return num1 / num2;
        }
        return 0;
    }

    //저장
    public void saveResult (double result) {
        results.add(result);
    }
}
