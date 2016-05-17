package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        int[] maxic = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            maxic[i] = list.get(i).length();
        }
        int min = min(maxic);
        for (int i = 0; i < maxic.length; i++)
        {
            if (min == maxic[i])
                System.out.println(list.get(i));

        }
    }

    public static int min(int[] array)
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}

