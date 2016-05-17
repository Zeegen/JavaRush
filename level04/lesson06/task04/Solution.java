package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
//import javax.swing.JOptionPane;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String one = reader.readLine();
       // String two = reader.readLine();
        Cat cat1 = new Cat();
        Cat cat2  = new Cat();
        cat1.name = reader.readLine();
       // cat1.name = String.valueOf(JOptionPane.showInputDialog("Имя первой кошки"));
      //  cat1.age = Integer.valueOf(JOptionPane.showInputDialog("Возраст первой кошки"));

        cat2.name = reader.readLine();
       // cat2.name = String.valueOf(JOptionPane.showInputDialog("Имя второй кошки"));
       // cat2.age = Integer.valueOf(JOptionPane.showInputDialog("Возраст второй кошки"));

       // System.out.printf("Имя: %s возраст: %d\n", cat1.name, cat1.age);
       // System.out.printf("Имя: %s возраст: %d\n", cat2.name, cat2.age);

if (cat1.name.equals(cat2.name)){
    System.out.println("Имена идентичны");

} else if (cat1.name.length() == cat2.name.length()){

    System.out.println("Длины имен равны");
}
    }

    public static class Cat {
        String name;
//int age;

    }
}
