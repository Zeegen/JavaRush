package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<String>();
        array.add("мама");
        array.add("мыла");
        array.add("раму");
        for (int i = 1; i <= array.size(); i = i + 2)
        {
            array.add(i, "именно");
        }


        for (String a : array) System.out.println(a);

    }
}
