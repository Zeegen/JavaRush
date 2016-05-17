package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int mini = min(min(a, b),c);
        int maxi = max(max(a, b),c);
        int middle;
        if(a != mini & a != maxi) {
            middle = a;
        } else if (b != mini & b != maxi){
            middle = b;
        }else {
            middle = c;
        }
        System.out.println(maxi + " " + middle + " " + mini);
    }
    public static int min(int a, int b) {
        int min;
        if (a < b)
            min = a;
        else
            min = b;
        return min;
    }

    public static int max(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }
}
