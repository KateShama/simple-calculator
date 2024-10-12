package sham.service;

public class ResultWriterService {
    // Метод для печати результата
    public void printResult(int num1, int num2, int result, String operationName) {
        System.out.println("Результат операции '" + operationName + "' между " + num1 + " и " + num2 + " равен: " + result);
    }
}
