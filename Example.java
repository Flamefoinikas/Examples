package com.mypackage;

import java.util.Scanner;


public class Example {

    public static void main(String[] args) {

        age();

    }
    
    public static int age(){
    Scanner sc= new Scanner(System.in);
        System.out.println("Give us your age");
    int age =0;
    while (true){
        age =sc.nextInt();
        if (age>0 && age <120){
        
            break;
        }
        System.out.println("Give age again");
    }
    
    
    return age;
    }

}
