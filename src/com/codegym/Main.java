package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        // Vòng lặp kích cỡ của mảng
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích cỡ của mảng < 20");
            }
        } while (size > 20);
        // gán giá trị các phần tử trong mảng.
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 1) + 1);
        }
        // Hien tri mang vua gan gia tri
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        // goi phuong thuc tim gia tri nho nhat trong mang
        System.out.println("\nGiá trị nhỏ nhát của mảng là: "+ minElement(array));

    }

    // Xây dựng phương thức tìm phần tử nhỏ nhất trong mảng.
    public static int minElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
