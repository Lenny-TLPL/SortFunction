/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 * @author Phi Long
 */
public class MergeSort {
    private String details;

    public MergeSort(String details) {
        this.details = details;
    }

    public MergeSort() {
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(double[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        double[] lTempArray = new double[n1];
        double[] rightTempArray = new double[(n2)];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            lTempArray[i] = arr[(l + i)];
        for (int j = 0; j < n2; ++j)
            rightTempArray[j] = arr[(m + 1 + j)];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (lTempArray[i] <= rightTempArray[j]) {
                arr[k] = lTempArray[i];
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = lTempArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static double[] sort(double[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;
    }

    /* A utility function to print array of size n */
    public static void printArray(double[] arr) {
        System.out.print("Array after sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("\nMerge Sort\nComplexity: O(Nlog(N))");
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
