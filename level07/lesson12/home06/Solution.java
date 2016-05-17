package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human buba = new Human("Люда", false, 55);
        Human buba2 = new Human("Галя", false, 60);
        Human didi = new Human("Толя", true, 60);
        Human didi2 = new Human("Слава", true, 71);
        Human mama = new Human("Марина", false, 24, didi, buba);
        Human papa = new Human("Коля", true, 25,didi2, buba2);
        Human sun = new Human("Дима", true, 12, papa, mama);
        Human douter = new Human("Ира", false, 15,papa, mama);
        Human douter2 = new Human("Оля", false, 14, papa, mama);

        System.out.println(buba);
        System.out.println(didi);
        System.out.println(buba2);
        System.out.println(didi2);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(sun);
        System.out.println(douter);
        System.out.println(douter2);

    }

    public static class Human
    {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        Human(String name, boolean sex, int age)
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

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}