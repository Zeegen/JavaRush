package com.javarush.test.level08.lesson08.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();

        set.add("Лена");
        set.add("Лоза");
        set.add("Лира");
        set.add("Лимон");
        set.add("Лицо");
        set.add("Лев");
        set.add("Лагуна");
        set.add("Лютик");
        set.add("Ладонь");
        set.add("Луиза");
        set.add("Лист");
        set.add("Лото");
        set.add("Ломоть");
        set.add("Лохмотья");
        set.add("Ладан");
        set.add("Львов");
        set.add("Латынь");
        set.add("Либретто");
        set.add("Лиана");
        set.add("Ложе");

      return set;
    }
}
