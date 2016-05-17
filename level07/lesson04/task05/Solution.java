package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        //напишите тут ваш код
        int[] array = initializeArray(20);
        int[] a = new int[array.length / 2];
        int[] b = new int[array.length / 2];

        for (int i = 0; i < array.length; i++)
        {
            if (i < array.length / 2)
            {
                a[i] = array[i];
            } else b[i - array.length/2] = array[i];
        }
        for (int i = 0; i < array.length / 2; i++)
        {
            System.out.println(b[i]);
        }

    }

    public static int[] initializeArray(int a) throws IOException
    {
        int[] number = new int[a];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a; i++)
        {
            number[i] = Integer.parseInt(reader.readLine());
        }
        return number;
    }
}
