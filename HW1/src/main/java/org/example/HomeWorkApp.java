package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"3", "5", "12", "33"},
                {"2", "3", "0", "56"},
                {"0", "5", "2", "2"},
                {"1", "2", "7", "8"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "3", "12", "3"},
                {"43", "12", "1", "5"},
                {"9", "2", "8", "4"},
                {"0", ""}
        };
        String[][] wrongCharMatrix = {
                {"1", "as", "2", "12"},
                {"6", "1", "q", "7"},
                {"zx", "7", "7", "6"},
                {"1", "29", "124", "5"}
        };

        try {
            System.out.println("Вариант 1:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println("Вариант 2:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
