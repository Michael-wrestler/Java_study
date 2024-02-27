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
        while(true) {
            System.out.println("Введи дату транзакции: ");
            String dateString = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            System.out.println("Ваша дата совершения транзакции: " + date);
            System.out.println("Введи cумму транзакции в виде целого числа: ");
            int x = scanner.nextInt();
            System.out.println("Введи сумму транзакции c плавающей точкой: ");
            double d = scanner.nextDouble();
            System.out.println("Введи cумму транзакции в виде целого числа: ");
            int m = scanner.nextInt();
            System.out.println("Введи сумму транзакции c плавающей точкой: ");
            double k = scanner.nextDouble();
            double s = x + d + m + k;
            System.out.println("Сумма транзакции: " + s);
            if ( s >= 100000){
                break;
            }
        }
    }
}
