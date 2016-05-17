package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name;
    int wight = 4;
    int age = 4;
    String color;
    String adress;
    public void initialize (String name){
        this.name = name;
    }
    public void initialize (String name, int wight, int age){
        this.name = name;
        this.wight = wight;
        this.age = age;

}
    public void initialize (String name, int age){
        this.name = name;
        this.age = age;

    }

    public void initialize (int age, String color)
    {
        this.age = age;
        this.color = color;
    }

    public void initialize (int wight, String color, String adress){
        this.wight = wight;
        this.color = color;
        this.adress = adress;
    }

}
