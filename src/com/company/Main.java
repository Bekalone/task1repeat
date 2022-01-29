package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String constantResult;
        final int NUM = 10;
        String word = "Antony";
        constantResult = NUM + " " + word;
        System.out.print(constantResult);
        if (NUM < 0){
            System.out.println(", Вы сохранили отрицательное число");
        } else if (NUM > 0){
            System.out.println(", Вы сохранили положительное число");
        } else{
            System.out.println(", Вы сохранили нуль");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Здравствуйте " + name + "!");
        in.close();
    }
}
