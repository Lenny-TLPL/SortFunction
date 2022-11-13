/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenny.sortfunction.utils;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Menu {
    public static int getChoice(ArrayList<String> option){
        int choice;
        for (int i =0 ; i < option.size();i++){
            System.out.println((i)+". "+option.get(i)+".");
        }
        System.out.println(option.size()+". Quit.");
        
        choice = Input.inputInt("your choice",0, option.size()+1);
        return choice;
    } 
}
