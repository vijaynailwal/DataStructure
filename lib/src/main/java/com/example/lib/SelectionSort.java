package com.example.lib;

public class SelectionSort {
    public static void main(String args[]) {
        int array[] = {20, 10, 35, 5};
        int n = array.length;

        for (int i = 0; i < n- 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
    }
}