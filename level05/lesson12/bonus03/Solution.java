package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());
for (int i = 1; i < maximum; i++){
    int a = Integer.parseInt(reader.readLine());
    b = max(a, b);
}



        System.out.println(b);
    }
    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
