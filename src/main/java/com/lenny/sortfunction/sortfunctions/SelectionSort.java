/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 *
 * @author Phi Long
 */
public class SelectionSort {
    private String details;

    public SelectionSort() {
    }

    public SelectionSort(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public static double[] sort(double[] arr)
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
 
    // Prints the array
    public static void printArray(double[] arr)
    {
        System.out.print("Array after sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("\nSelection Sort\nComplexity: O(N^2)");
    }
}
