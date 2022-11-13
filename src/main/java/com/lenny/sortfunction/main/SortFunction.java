/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.main;

import com.lenny.sortfunction.sortfunctions.*;
import com.lenny.sortfunction.utils.Input;
import com.lenny.sortfunction.utils.Menu;
import com.lenny.sortfunction.utils.Output;

import java.util.ArrayList;

/**
 * @author Phi Long
 */
public class SortFunction {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an array:");
//        int arr[] = new int[]{0, 8, 100, 11, 188, 211};
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(arr, 6);
//        bubbleSort.printArray(arr, 6);

//         float arr[] = { (float)0.897, (float)0.565,
//                        (float)0.656, (float)0.1234,
//                        (float)0.665, (float)0.3434 };
//         BucketSort bucketSort = new BucketSort();
//         bucketSort.bucketSort(arr, 6);
//         bucketSort.printArray(arr, 6);
//        CountingSort countingSort = new CountingSort();
//        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
//                       'r', 'g', 'e', 'e', 'k', 's' };
//  
//        countingSort.sort(arr);
//  
//        System.out.print("Sorted character array is ");
//        countingSort.printArray(arr, 13);
//        System.out.println("O(n+k)");
//        int arr[] = new int[]{0, 8, 100, 11, 188, 211};
//        HeapSort heapSort = new HeapSort();
//        heapSort.sort(arr);
//        heapSort.printArray(arr);
//        int arr[] = new int[]{0, 8, 100, 11, 188, 211};
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sort(arr);
//        insertionSort.printArray(arr);
//        int arr[] = new int[]{0, 8, 100, 11, 188, 211};
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.sort(arr, 0, arr.length - 1);
//        mergeSort.printArray(arr);
//        int arr[] = new int[]{0, 8, 100, 11, 188, 211};
//        int n = arr.length;
//        QuickSort quickSort = new QuickSort();
//        quickSort.quickSort(arr, 0, n-1);   
//        quickSort.printArray(arr, n);
//        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
//        int n = arr.length;
//        RadixSort radixSort = new RadixSort();
//        // Function Call
//        radixSort.radixsort(arr, n);
//        radixSort.print(arr, n);
//        SelectionSort selectionSort = new SelectionSort();
//        int arr[] = {64,25,12,22,11};
//        selectionSort.sort(arr);
//        selectionSort.printArray(arr);
        ArrayList<String> options = new ArrayList<>();
        options.add("Bubble sort");
        options.add("Bucket sort");
        options.add("Counting sort");
        options.add("Heap sort");
        options.add("Insertion sort");
        options.add("Merge sort");
        options.add("Quick sort");
        options.add("Radix sort");
        options.add("Selection sort");

        int n;
        boolean cont = true;
        double[] inputDoubleArray;
        int[] inputIntArray;
        BubbleSort bubbleSort;
        BucketSort bucketSort;
        CountingSort countingSort;
        HeapSort heapSort;
        InsertionSort insertionSort;
        MergeSort mergeSort;
        QuickSort quickSort;
        RadixSort radixSort;
        SelectionSort selectionSort;

        System.out.println("--------Welcome to sort tool--------");
        System.out.println();
        do {
            int choice = Menu.getChoice(options);
            switch (choice) {
                case 0 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    bubbleSort = new BubbleSort();
                    Output.outputArray(inputDoubleArray);
                    BubbleSort.bubbleSort(inputDoubleArray);
                    bubbleSort.setDetails("""

                            This is Bubble Sort.
                            This sort function continuous swapping adjacent elements in a loop until the input array is sorted.
                            Complexity: O(n^2)""");
                    Output.outputArray(inputDoubleArray, bubbleSort.getDetails());
                }
                case 1 -> {
                    int bucketSize = Input.inputInt("bucket size");
                    inputDoubleArray = Input.inputDoubleArray();
                    bucketSort = new BucketSort();
                    Output.outputArray(inputDoubleArray);
                    BucketSort.bucketSort(inputDoubleArray, bucketSize);
                    bucketSort.setDetails("""

                            This is Bucket Sort.
                            This sort function divides elements into small buckets to sort them and then merge all the buckets into 1 big sorted bucket.
                            Complexity: O(n)""");
                    Output.outputArray(inputDoubleArray, bucketSort.getDetails());
                }
                case 2 -> {
                    inputIntArray = Input.inputIntArray();
                    countingSort = new CountingSort();
                    Output.outputArray(inputIntArray);
                    CountingSort.countingSort(inputIntArray);
                    countingSort.setDetails("""

                            This is Counting Sort.
                            This sort function counts the numbers of objects having distinct key values
                            After that it does arithmetic to calculate the position of each object in the output sequence
                            Complexity: O(n+k)""");
                    Output.outputArray(inputIntArray, countingSort.getDetails());
                }
                case 3 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    heapSort = new HeapSort();
                    Output.outputArray(inputDoubleArray);
                    HeapSort.sort(inputDoubleArray);
                    heapSort.setDetails("""

                            This is Heap Sort.
                            This sort function turns input array into binary tree then heapify in loop until the array is sorted.
                            Complexity: O(N log N).""");
                    HeapSort.printArray(inputDoubleArray);
                }
                case 4 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    insertionSort = new InsertionSort();
                    Output.outputArray(inputDoubleArray);
                    insertionSort.sort(inputDoubleArray);
                    insertionSort.setDetails("""

                            This is Insertion Sort.
                            This sort function divides array into sorted and unsorted part.
                            Then it picked elements from unsorted part and put it to correct order in sorted part.
                            Complexity: O(N^2)\s""");
                    Output.outputArray(inputDoubleArray,insertionSort.getDetails());
                }
                case 5 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    mergeSort = new MergeSort();
                    Output.outputArray(inputDoubleArray);
                    mergeSort.sort(inputDoubleArray, 0, inputDoubleArray.length - 1);
                    mergeSort.setDetails("""

                            This is Merge Sort.
                            This sort function is based on divide and conquer paradigm.
                            It divides the array and then merges it again to make sorted array.
                            Complexity: O(Nlog(N))""");
                    Output.outputArray(inputDoubleArray, mergeSort.getDetails());
                }
                case 6 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    n = inputDoubleArray.length;
                    quickSort = new QuickSort();
                    Output.outputArray(inputDoubleArray);
                    quickSort.quickSort(inputDoubleArray, 0, n - 1);
                    quickSort.setDetails("""

                            This is Quick Sort.
                            This sort function is based on divide and conquer paradigm.
                            This sort function partitions the givens array around the picked pivot.
                            This sort function is not stable.
                            Complexity: Worst:(n^2), Best: (nLogn)""");
                    Output.outputArray(inputDoubleArray, quickSort.getDetails());
                }
                case 7 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    radixSort = new RadixSort();
                    Output.outputArray(inputDoubleArray);
                    radixSort.radixSort(inputDoubleArray);
                    radixSort.setDetails("""

                            This is Radix Sort
                            .This sort function sorts array by sorting each unit in the array elements.
                            Complexity:  O(d*(n+b)).\s
                            Where:\s
                            d is the number of digits in the given list.
                            n is the number of elements in the list.
                            b is the base or bucket size used, which is normally base 10 for decimal representation.""");
                    Output.outputArray(inputDoubleArray, radixSort.getDetails());
                }
                case 8 -> {
                    inputDoubleArray = Input.inputDoubleArray();
                    selectionSort = new SelectionSort();
                    Output.outputArray(inputDoubleArray);
                    selectionSort.sort(inputDoubleArray);
                    selectionSort.setDetails("""

                            This Selection Sort.
                            This sort function continuously finds smallest value in the array and arrange it.
                            Complexity: O(N^2)""");
                    SelectionSort.printArray(inputDoubleArray);
                }
                case 9 -> {
                    System.out.println("Bye! Thanks for using this tool.");
                    System.out.println("This tool was made by Long aka Lenny-TLPL");
                    cont = false;
                }
            }
        } while (cont);
    }
}
