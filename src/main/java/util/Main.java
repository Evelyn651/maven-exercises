package util;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        //tell if the input is numeric
//        System.out.println("Enter something: ");
        System.out.println(StringUtils.isNumeric(input.getString()));
        //flip the case of the string
        System.out.println("Enter your name:");
        System.out.println( "Swap case: " + StringUtils.swapCase(input.getString()));
        //reverse a string
        System.out.println("Enter a book title: ");
        System.out.println(StringUtils.reverse(input.getString()));


    }
}
