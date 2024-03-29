package com.example.lib;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {20, 10, 50, 40};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //  --------------- swap elements ----------------------------------
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    printArray(array);

                }
            }
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}