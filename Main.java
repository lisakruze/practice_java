package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }


    private static void numbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int[] arr = {12, 5, 9, 66, 1};

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }


    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


    static int[] input = {10, 5, 4, 3, 2, 7, 1, 4};

    private static void bubbleSort(int[] input) {

        for (int j = 0; j < input.length - 1; j++) {
            for (int i = 0; i < input.length - 1 - j; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
        }

        for (int i : input) {
            System.out.println(i);
        }
    }

//    Задача 1: Сложение и вычитание чисел
//    Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
//    Пример ввода:
//    Copy code
//10
//        5
//    Пример вывода:
//    makefile
//    Copy code
//    Сумма: 15
//    Разность: 5

    private static void scannerCalc() {
        try (Scanner s = new Scanner(System.in)) {
            int fistNumber;
            int secondNumber;

            System.out.println("Insert first number: ");
            fistNumber = s.nextInt();
            System.out.println("Insert second number: ");
            secondNumber = s.nextInt();

            int sum = fistNumber + secondNumber;
            System.out.println("Sum: " + sum);
            int diff = fistNumber - secondNumber;
            System.out.println("Diff: " + diff);

            System.out.println("End");
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }

    }

//    Задача 2: Площадь прямоугольника
//    Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
//            Пример:
//    makefile
//    Copy code
//    Ширина: 4
//    Длина: 6
//    Площадь: 24

    private static void calculateRectangleArea() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter length of rectangle: ");
            double length = Double.parseDouble(s.nextLine());
            System.out.println("Enter width of rectangle: ");
            double width = Double.parseDouble(s.nextLine());
            if (length > 0 && width > 0) {
                double area = length * width;
                System.out.println("Result: " + area);
            } else {
                System.out.println("Insert positive numbers");
                System.out.println("Try again");
            }
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }
    }


    //    Задача 3: Операции с остатком от деления
//    Запросите у пользователя два числа и выведите результат их деления и остаток от деления.
//    Пример:
//    makefile
//    Copy code
//    Введите первое число: 17
//    Введите второе число: 3
//    Результат деления: 5
//    Остаток: 2
    private static void divideCalculation() {
        try (Scanner s = new Scanner(System.in)) {
            int fistNumber;
            int secondNumber;

            System.out.println("Insert first number: ");
            fistNumber = s.nextInt();
            System.out.println("Insert second number: ");
            secondNumber = s.nextInt();
            if (secondNumber == 0) {
                System.out.println("Dividing 0 is not allowed sorry, please try again");
                return;
            }
            int quotient = fistNumber / secondNumber;
            System.out.println("quotient: " + quotient);
            int remained = fistNumber % secondNumber;
            System.out.println("Diff: " + remained);

            System.out.println("End");
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }
    }


//    Задачи на if и switch
//    Задача 1: Проверка чётности числа
//    Напишите программу, которая проверяет, является ли число чётным или нечётным.
//    Пример:
//    makefile
//    Copy code
//    Введите число: 8
//    Результат: Чётное

    private static String isNumberEvenOrOdd(int input) {
        String result = "";
        if (input % 2 == 0) {
            result = "Number is even";
        } else {
            result = "Number is odd";
        }
        return result;
    }

    //    Задача 2: Калькулятор с использованием switch
//    Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
//    Пример:
//    makefile
//    Copy code
//    Введите первое число: 7
//    Введите оператор: *
//    Введите второе число: 3
//    Результат: 21
    private static void simpleCalculation() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Insert first number: ");
            double firstNumber = Double.parseDouble(s.nextLine());

            System.out.print("Insert operator (+, -, *, /): ");
            String operator = s.nextLine();

            System.out.print("Insert second number: ");
            double secondNumber = Double.parseDouble(s.nextLine());

            HashSet<Character> operators = new HashSet<>(List.of('*', '/', '+', '-'));
            boolean isValidOperator = false;
            double result = 0;
            if (operators.contains(operator.charAt(0))) {
                isValidOperator = true;
            } else {
                System.out.println("Operator is not supported. Insert valid operator.");
                s.close();
            }

            switch (operator.charAt(0)) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("Dividing 0 is not allowed");
                        isValidOperator = false;
                        break;
                    } else {
                        result = firstNumber / secondNumber;
                        break;
                    }
                default:
                    System.out.println("Not valid operator");
            }
            if (isValidOperator) {
                System.out.println("Result= " + result);
            }
        } catch (Exception e) {
            System.out.println("Error has occurred " + e.getMessage());
        }
    }

    //
//    Задача 3:  Определение времени года
//    Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.
//    Пример:
//    makefile
//    Copy code
//    Введите номер месяца: 12
//    Результат: Зима
    private static void findSeason() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number of month (1-12): ");
            int monthNumber = s.nextInt();
            String season = "";
            HashSet<Integer> months = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
            boolean isValidMonth = true;
            if (!months.contains(monthNumber)) {
                System.out.println("Number is not valid, try again using 1-12");
                isValidMonth = false;
                s.close();
            }
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Autumn";
                    break;
            }
            if (isValidMonth) {
                System.out.println("Season is " + season);
            }
        } catch (Exception e) {
            System.out.println("An error has occurred " + e.getMessage());
        }
    }

//    Задачи на for
//    Задача 1: Вывод чисел от 1 до 10
//    Напишите программу, которая выводит все числа от 1 до 10.
//    Пример вывода:
//    Copy code
//1 2 3 4 5 6 7 8 9 10

    private static void out() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }


//    Задача 2: Сумма чисел от 1 до N
//    Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
//    Пример:
//    makefile
//    Copy code
//    Введите N: 5
//    Сумма: 15

    private static int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Number must be >= 1");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }


//    Задача 3: Таблица умножения для числа
//    Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
//    Пример:
//    python
//    Copy code
//    Введите число: 3
//            3 x 1 = 3
//            3 x 2 = 6
//            ...
//            3 x 10 = 30

    private static void multiplyTableForNumber(int n) {
        if (n < 1 || n > 10) {
            System.out.println("Numbers must be in range 1-10");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            int result = 0;
            result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }

//    Задача 5: Чётные числа до N
//    Пользователь вводит число N. Выведите все чётные числа от 1 до N.
//    Пример:
//    mathematica
//    Copy code
//    Введите N: 10
//    Чётные числа: 2 4 6 8 10

    private static void evenNumbers(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Number must be >= 1");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//    Задачи на вложенные циклы
//    Задача 1: Таблица умножения
//    Выведите таблицу умножения от 1 до 10 в формате:
//    python
//    Copy code
//            1 x 1 = 1
//            1 x 2 = 2
//            ...
//            10 x 10 = 100

    private static void multiplyTable() {
        for (int i = 1; i <= 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= 10; j++) {
                int multiplyResult = i * j;
                sb.append(i + " * " + j + " = " + multiplyResult);
                sb.append('\t');

            }
            System.out.println(sb);
        }
    }
//    Задача 2: Прямоугольник из звёздочек
//    Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
//    Пример:
//    markdown
//    Copy code
//        ****
//        ****
//        ****

    private static void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= width; j++) {
                sb.append("*");

            }
            System.out.println(sb);
        }

    }

    private static void iHateViolence(int width, int height) {
        for (int i = 1; i <= height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= width; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }


}
