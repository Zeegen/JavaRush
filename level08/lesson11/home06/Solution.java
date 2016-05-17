package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human doter = new Human("Ira", false, 15);
        Human doter2 = new Human("Oly", false, 14);
        Human sun = new Human("Dima", true, 12);

        Human father = new Human("Kol", true, 38, new Human[]{doter, doter2, sun});
        Human mother = new Human("Marina", false, 38, new Human[]{doter, doter2, sun});

        Human gredFather1 = new Human("Toly", true, 72, new Human[]{mother});
        Human grendMother1 = new Human("Ludi", false, 69, new Human[]{mother});

        Human gredFather2 = new Human("Slava", true, 69, new Human[]{father});
        Human grendMother2 = new Human("Gali", false, 56, new Human[]{father});

        System.out.println(doter);
        System.out.println(sun);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(gredFather1);
        System.out.println(grendMother1);
        System.out.println(gredFather2);
        System.out.println(grendMother2);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human[] chil)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(children, chil);
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
