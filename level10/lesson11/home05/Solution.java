package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> result = new LinkedHashMap<Character, Integer>();
        for (Character character : alphabet)
        {
            result.put(character, 0);
        }

        for (String str : list)
        {
            for (int i = 0; i < str.length(); i++)
                result.put(str.charAt(i), result.get(str.charAt(i))+1);
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //напишите тут ваш код
        /*TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (String a : list)
        {
            char[] chars = a.toCharArray();
            for (int i = 0; i < chars.length; i++)
            {
                if (treeMap.containsKey(chars[i])) treeMap.put(chars[i], treeMap.get(chars[i]) + 1);
                else treeMap.put(chars[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> a : treeMap.entrySet())
            System.out.println(a.getKey() + " " + a.getValue());*/
    }

}
