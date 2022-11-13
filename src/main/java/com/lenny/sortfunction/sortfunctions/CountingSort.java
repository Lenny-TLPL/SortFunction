/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 * @author Phi Long
 */
public class CountingSort {
    private String details;

    public CountingSort(String details) {
        this.details = details;
    }

    public CountingSort() {
    }

    public static void sort(char[] arr) {
        int n = arr.length;

        // The output character array that will have sorted arr
        char[] output = new char[n];

        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int[] count = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;

        // store count of each character
        for (char c : arr) ++count[c];

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    public static int[] countingSort(int[] arr) { // create buckets
        int k = findMax(arr);
        int[] counter = new int[(k + 1)];
        // fill buckets
        for (int i : arr) {
            counter[(i)]++;
        }
        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                arr[ndx++] = i;
                counter[i]--;
            }
        }
        return arr;
    }

    public static void printArray(char[] arr) {
        System.out.print("Array after sort: ");
        for (char j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\nCounting Sort\nComplexity: O(n+k)");
    }

    public static void printArray(double[] arr) {
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nCounting Sort\nComplexity: O(n+k)");
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nCounting Sort\nComplexity: O(n+k)");
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
