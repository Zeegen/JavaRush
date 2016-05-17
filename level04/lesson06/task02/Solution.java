package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String one = reader.readLine();
        int a = Integer.parseInt(one);
        String two = reader.readLine();
        int b = Integer.parseInt(two);
        String three = reader.readLine();
        int c = Integer.parseInt(three);
        String four = reader.readLine();
        int d = Integer.parseInt(four);
        System.out.println(max(a, b, c, d));
    }
        public static int max (int a, int b, int c, int d) {
        int m3;
        if (max (a, b) > max(c, d))
            m3 = max (a, b);
        else
            m3 = max (c, d);
        return m3;

    }

        public static int max(int a, int b) {
        int m2;
        if (a > b)
            m2 = a;
        else
            m2 = b;

        return m2;

    }


}
