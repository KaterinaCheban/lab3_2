package ad211.cheban;

import java.util.Scanner; // используем для считывания информации, введенной пользователем
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть строку: ");
        String n = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) { // ищем числа и их суммируем
            char c = n.charAt(i);
            if (Character.isDigit(c)) sum += Character.getNumericValue(c); /* Преобразует указанный числовой символ Юникода
            в число двойной точности с плавающей запятой */
        }
        System.out.println("Сума цифр: " + sum); // выводим сумму чисел
    }
}