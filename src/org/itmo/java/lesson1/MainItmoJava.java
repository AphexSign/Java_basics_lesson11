package org.itmo.java.lesson1;

import java.util.Scanner;

public class MainItmoJava {
    public static void main(String[] args) {
        //Блок1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //Блок2.1
        double result=10/3d*(46+10);
        System.out.println(result);
        //Блок2.2
        double result2=29*4*-15;
        System.out.println(result2);

        //Блок3
        double number=10500;
        double result3=(double)(number/10)/10;
        System.out.println(result3);

        //Блок4
        double result4=3.6*4.1*5.9d;
        System.out.println(result4);
        //Блок5
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i<3;i++){
            System.out.println("Введите число N"+(i+1)+": ");
            int value=scanner.nextInt();
            System.out.println("Вы ввели число: "+value);
        }


        //Блок6
        System.out.println("Введите уникальное число b для задания 6: ");
        int b = scanner.nextInt();

        if (b%2==0  & b<100 ){
            System.out.println("Число четное");
        } else if (b%2==1 & b<100) {
            System.out.println("Число нечетное");
        } else if (b%2==0 & b>100) {
            System.out.println("Число выходит за пределы");
        }


    }

}
