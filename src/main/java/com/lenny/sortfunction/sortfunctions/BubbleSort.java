/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 *
 * @author Phi Long
 */
public class BubbleSort {
    private String details;

    public BubbleSort() {
    }
    public BubbleSort(String details) {
        this.details = details;
    }
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    //    O(n^2)
    public static double[] bubbleSort(double[] arr) {
        int i, j;
        double temp;
        int n = arr.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] và arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có phần tử nào để hoán đổi
            // bên trong vòng lặp thì Break
            if (!swapped)
                break;
        }
        return arr;
    }

    // In các phần tử của mảng
    public static void printArray(double[] arr) {
        System.out.print("Array after sort: ");
        for (double i : arr)
            System.out.print(i + " ");
        System.out.println("\nBubble Sort\nComplexity: O(n^2)");
    }
}
