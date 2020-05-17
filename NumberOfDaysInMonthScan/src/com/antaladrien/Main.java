package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int num1 = myObj.nextInt();
        System.out.println("Enter year:");
        int num2 = myObj.nextInt();

        System.out.println("Days in month:");
        System.out.println(getDaysInMonth(num1, num2));
    }

    public static boolean isLeapYear(int year) {
        if (((year >= 1) && (year <= 9999)) && ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0))) {
            return true;
        } return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        int days;
        boolean leapYear = isLeapYear(year);

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (leapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                return -1;
        }
        return days;
    }
}
