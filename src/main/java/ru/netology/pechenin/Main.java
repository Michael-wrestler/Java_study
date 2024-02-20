package ru.netology.pechenin;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        data();
    }

    public static void data(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введи дату транзакции: ");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println("Ваша дата совершения транзакции: " + date);
        System.out.println("Введи целое число: ");
        int x = scanner.nextInt();
        System.out.println("Введи число c плавающей точкой: ");
        double d = scanner.nextDouble();
        System.out.println("Сумма транзакции: " + x);
        System.out.println("Ваша скидка составила: " + d);
    }
}
