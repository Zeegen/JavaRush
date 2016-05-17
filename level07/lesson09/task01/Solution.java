package com.javarush.test.level07.lesson09.task01;


import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        List<Integer> array = initializeArray(20);
        List<Integer> third = new LinkedList<>();
        List<Integer> second = new LinkedList<>();
        List<Integer> another = new LinkedList<>();


        for (int a : array)
        {
            if (a % 3 == 0) third.add(a);
            if (a % 2 == 0) second.add(a);
            if (a % 2 != 0 & a % 3 != 0) another.add(a);

        }
        printList(third);
        printList(second);
        printList(another);

    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код

        for (int a : list) System.out.println(a);


    }

    public static List<Integer> initializeArray(int a) throws IOException
    {
        List<Integer> number = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a; i++)
        {
            number.add(Integer.parseInt(reader.readLine()));
        }
        return number;
    }
}
