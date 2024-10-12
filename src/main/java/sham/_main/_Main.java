package sham._main;
import sham.service.ResultWriterService;
import sham.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        // Создаём экземпляры классов
        Calculator calculator = new Calculator();
        ResultWriterService writer = new ResultWriterService();

        // Примеры чисел
        int num1 = 10;
        int num2 = 5;

        // Вычисляем результаты
        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);

        // Выводим результаты
        writer.printResult(num1, num2, sum, "Сумма:");
        writer.printResult(num1, num2, difference, "Разность:");
        writer.printResult(num1, num2, product, "Произведение:");
    }
}
