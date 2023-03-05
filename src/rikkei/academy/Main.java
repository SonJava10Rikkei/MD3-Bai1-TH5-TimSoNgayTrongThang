package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        if (month < 13) {
            switch (month) {
                case 2:
                    System.out.println("The month " + month + " has 28 or 29 days! ");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("The month " + month + " has 30 days! ");
                    break;
                default:
                    System.out.println("The month " + month + " has 31 days! ");
            }
        } else {
            System.out.println("Hay nhập lại tháng bạn muốn kiểm tra");
        }
    }
}
