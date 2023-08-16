public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("\nЗадача 1");
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        for (int number = 0; number <= 17; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        for (int number = 10; number >= -10; number--) {
            System.out.println(number);
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        int initialYear = 1904;
        int finalYear = 2096;

        for (int year = initialYear; year <= finalYear; year += 4) {
            System.out.println(year + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        int startNumber = 7;
        int finalNumber = 98;
        int step = 7;

        for (int number = startNumber; number <= finalNumber; number += step) {
            System.out.print(number + " ");
        }

    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int startNumber = 1;
        int finalNumber = 512;

        for (int i = startNumber; i <= finalNumber; i *= 2 ) {
            System.out.print(i + " ");
        }
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        int monthSaving = 29000;
        int totalSaving = 0;

        for (int month = 1; month <= 12; month++) {
            totalSaving += monthSaving;
            System.out.println("Месяц " + month + " - сумма накоплений равна " + totalSaving + " рублей");
        }
    }

    public static void task9() {
        System.out.println("\nЗадача 9");
        int monthlSaving = 29000;
        var annualInterestRate = 0.12;
        var totalSaving = 0;

        for (int month = 1; month <= 12; month++) {
            var interest = totalSaving * (annualInterestRate / 12);
            totalSaving += monthlSaving + interest;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving + " рублей");
        }
    }

    public static void task10() {
        System.out.println("\nЗадача 10");
        int number = 2;

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}





