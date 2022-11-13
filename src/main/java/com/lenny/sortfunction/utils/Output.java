/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenny.sortfunction.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LENOVO
 */
public class Output {
    public static String name;

    public static void output() {
        System.out.println("**** " + name + " Information ****");
    }

    public static void output(String field, String value) {
        if (value == null) {
            System.out.println("- " + name + "'s " + field + ": " + "No data");
        } else {
            System.out.println("- " + name + "'s " + field + ": " + value.toLowerCase());
        }

    }

    public static void output(String field, int value) {
        System.out.println("- " + name + "'s " + field + ": " + value);
    }

    public static void output(String field, double value) {
        System.out.println("- " + name + "'s " + field + ": " + (Math.round(value * 100.0) / 100.0));
    }

    public static void result(boolean bool) {
        if (bool) System.out.println("Success.");
        else System.out.println("Fail.");
    }

    public static void outputDel(String field) {
        System.out.println(field + " has been deleted.");
    }

    public static void output(String field, Date value) throws ParseException {
        System.out.print("- " + name + "'s " + field + ": ");
        if (value.compareTo(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/0001")) == 0) {
            System.out.println("No data");
        } else {
            SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(dt1.format(value));
        }

    }

    public static void outputArray(double[] arr, String details) {
        System.out.println("--------------------------------");
        System.out.print("Array after sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("\nDetails: ");
        System.out.println(details);
        System.out.println("--------------------------------");
    }

    public static void outputArray(double[] arr) {
        System.out.print("Array before sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("");
    }

    public static void outputArray(int[] arr, String details) {
        System.out.println("--------------------------------");
        System.out.println("Array after sort: ");
        for (int i : arr) System.out.println(i + " ");
        System.out.println("\nDetails: ");
        System.out.println(details);
        System.out.println("--------------------------------");
    }

    public static void outputArray(int[] arr) {
        System.out.println("Array before sort: ");
        for (int i : arr) System.out.println(i + " ");
        System.out.println("");
    }

}
