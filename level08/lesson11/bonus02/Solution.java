package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<>();
        while (true)
        {
            String adress = reader.readLine();
            if (adress.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;


            addresses.put(adress, family);
        }

        //read home number
        String sity = reader.readLine();

        if (0 < addresses.size())
        {
            String familySecondName = addresses.get(sity);
            System.out.println(familySecondName);
        }
    }
}
