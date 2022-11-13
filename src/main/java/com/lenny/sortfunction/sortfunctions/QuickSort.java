/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 * @author Phi Long
 */
public class QuickSort {
    private String details;

    public QuickSort() {
    }

    public QuickSort(String details) {
        this.details = details;
    }

    static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(double[] arr, int low, int high) {

        // pivot
        double pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    public static double[] quickSort(double[] arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    // Function to print an array
    public static void printArray(double[] arr) {
        System.out.print("Array after sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("\nQuick Sort\nNot stable\nComplexity: Worst:(n^2), Best: (nLogn)");
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
