package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int[] test = reverse(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(test[i]);
    }

    public static int[] initializeArray() throws IOException
    {
        int[] number = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            number[i] = Integer.parseInt(reader.readLine());
        }
        return number;
    }

    public static int[] reverse(int[] array)
    {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++)
        {

            reverse[i] = array[array.length - i - 1];
        }

        return reverse;
    }
}
