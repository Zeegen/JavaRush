package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

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
        System.out.println( middle );
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

