package com.example.Calculator2;

import java.util.ArrayList;

public class Calculator2 {
    //필드 정의
    private ArrayList<Integer> results = new ArrayList<>();

    //Getter 메소드
    public ArrayList<Integer> getResults() {
        return new ArrayList<>(results);
    }

    //Setter 메소드
//    public void setResults(ArrayList<Integer> results) {
//        this.results = new ArrayList<Integer>(results);
//    }


    //사칙연산 메서드
    public int calculate(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        return 0;
    }

    //저장
    public void saveResult(int result) {
        results.add(result);
    }

    //삭제
    public void removeResult() {
        results.remove(0);
    }
}
