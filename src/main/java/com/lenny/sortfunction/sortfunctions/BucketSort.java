/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Phi Long
 */
public class BucketSort {
    private String details;

    public BucketSort() {

    }

    public BucketSort(String details) {
        this.details = details;
    }

    public static double[] bucketSort(double[] array, int bktSize) {

        //creating a list of buckets for storing lists
        List<Double>[] buckets = new List[bktSize];
// Linked list with each bucket array index
// as there may be hash collision
        for (int i = 0; i < bktSize; i++) {
            buckets[i] = new LinkedList<>();
        }
//calculate the hash and assigns elements to the proper bucket
        for (double num : array) {
            buckets[hash(num, bktSize)].add(num);
        }
//iterate over the buckets and sorts the elements
        for (List<Double> bucket : buckets) {
//sorts the bucket
            Collections.sort(bucket);
        }
        int index = 0;
//gathered the buckets after sorting
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                array[index++] = num;
            }
        }
        return array;
    }

    //distributing elements
    private static int hash(double num, int bucketSize) {
        return (int) (num / bucketSize);
    }

    public static void printArray(double[] arr) {
        System.out.print("Array after sort: ");
        for (double i : arr)
            System.out.print(i + " ");
        System.out.println("\nBucket Sort\n Complexity: O(n)");
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
