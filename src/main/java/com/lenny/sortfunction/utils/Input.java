/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenny.sortfunction.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Input {
    public static void input(String name){
        System.out.println("**** Input "+name+" Information ****");
    }
    public static int inputInt(String field,int min , int max){
        boolean cond = true;
        String out;
        if(min >max){
            int swap=min;
            min = max;
            max= swap;  
        }
        if(field==null) out="Enter the number: ";
        else out="Enter the "+field+" : ";
        int num=0;
        do{
            try{
            
               Scanner sc= new Scanner(System.in);
               System.out.print(out);
               num=sc.nextInt();
               if ( num>max||num <min){
                    throw new Exception();
               }    
               cond = false;
           } catch (InputMismatchException l){
                System.out.println("Wrong!!!!Enter again.");
                cond=true;
            }catch (Exception e){
               System.out.println("The number is invalid");
               cond = true;
            }
            
        }while(cond);
        return num;
    }
    
    public static int inputInt(String field){
        boolean cond = true;
        String out="Enter the "+field+" : ";
        int num=0;
        do{
            try{
            
               Scanner sc= new Scanner(System.in);
               System.out.print(out);
               num=sc.nextInt();
               if ( num<0){
                    throw new Exception();
               }    
               cond = false;
           } catch (InputMismatchException l){
                System.out.println("Wrong!!!!Enter again.");
                cond=true;
            }catch (Exception e){
               System.out.println(field+" must be >=0.");
               cond = true;
            }
            
        }while(cond);
        return num;
    }
    
    public static double inputDouble(String field){
        boolean cond = true;
        String out="Enter the "+field+" : ";
        double num=0;
        do{
            try{
            
               Scanner sc= new Scanner(System.in);
               System.out.print(out);
               num=sc.nextDouble();
               if ( num<0){
                    throw new Exception();
               }    
               cond = false;
           } catch (InputMismatchException l){
                System.out.println("Wrong!!!!Enter again.");
                cond=true;
            }catch (Exception e){
               System.out.println(field+" must be >0.");
               cond = true;
            }
            
        }while(cond);
        return num;
    }

    public static String inputString(String field){
        boolean cont = false;
        String s=null;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the "+field+" : ");
                s=sc.nextLine();
                if (s.equals(" ")||s.equals(""))
                    throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("Wrong!!!!Enter again.");
                cont=true;
            }
        }while(cont);
        return s;
    }
    
    public static String inputString(String field,String pattern,int min, int max){
        boolean cont = false;
        String s=null;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the "+field+" : ");
                s=sc.nextLine();
                if (s.equals(" ")||s.equals("")||s.matches(pattern)==false||s.length()<min||s.length()>max)
                    throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("Wrong!!!!Enter again.");
                cont=true;
            }
        }while(cont);
        return s;
    }
    
    public static String inputFileName(String field){
        boolean cont = false;
        String PATTERN="[a-zA-Z0-9_]*";
        String s=null;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the "+field+" : ");
                s=sc.nextLine();
                if (s.equals(" ")||s.equals("")||!s.matches(PATTERN))
                    throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("Wrong format!!!!Enter again.");
                cont=true;
            }
        }while(cont);
        s= s+".dat";
        return s;
    }
    
    public static String inputString(String field,String dk1,String dk2){
        boolean cont = false;
        String s=null;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(field+" : ");
                s=sc.nextLine().trim();
                if (!s.equalsIgnoreCase(dk1)&&!s.equalsIgnoreCase(dk2))
                    throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("Wrong format!!!!Enter again.");
                cont=true;
            }
        }while(cont);
        return s;
    }

    public static Date inputValidDate(String date) throws ParseException{
        boolean cont = true;
        String PATTERN = "\\d{2}[/]\\d{2}[/]\\d{4}";
        String pDate=null;
        int day =0;
        int month=0;
        int year=0;
        do{
            int maxd=31;
            pDate = Input.inputString(date+"(dd/mm/yyyy)");
            if(pDate.matches(PATTERN)){
                String[] time = pDate.split("/");
                day = Integer.parseInt(time[0]);
                month = Integer.parseInt(time[1]);
                year = Integer.parseInt(time[2]);
                if(month==4||month==6||month==9||month==11)
                    maxd=30;
                else if(month==2){
                    if(year%400==0||(year%4==0&&year%100!=0))
                        maxd=29;
                    else 
                        maxd=28;
                    }   
                if(day<=maxd){
                    cont = false;
                }else{
                    System.out.println("Invalid date!!!! Enter again.");
                    cont = true;
                }
            } else {
                System.out.println("Invalid date!!!! Enter again.");
                cont = true;
            }               
        }while(cont);
        
        Date fdate=new SimpleDateFormat("dd/MM/yyyy").parse(pDate);
        return fdate;
    }

    public static int[] inputIntArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of the array: ");
        int n = sc.nextInt();
        System.out.println("\nInput the array:(integer only) ");
        int[] inputArray = new int[n];
        for(int i=0; i<n; i++){
            inputArray[i] = sc.nextInt();
        }
        return inputArray;
    }

    public static double[] inputDoubleArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of the array: ");
        int n = sc.nextInt();
        System.out.println("\nInput the array: ");
        double[] inputArray = new double[n];
        for(int i=0; i<n; i++){
            inputArray[i] = sc.nextDouble();
        }
        return inputArray;
    }
}
