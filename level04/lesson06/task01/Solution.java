package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int one = Integer.parseInt(a);
        //double one = Double.parseDouble(a);
        String b = reader.readLine();
        int two = Integer.parseInt(b);
       // double two = Double.parseDouble(b);

        if (one > two){
            System.out.println(two);
        } else {
            System.out.println(one);
        }
    }
}