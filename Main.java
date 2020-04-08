package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Salary: ");
        int num = in.nextInt();
        int newsa = num-(num/10);

        System.out.printf("Your new salary is: %d \n", newsa);
        in.close();
    }
}
