package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сталлоне", "Сильвестр");
        map.put("Мориконе", "Энио");
        map.put("Вивальди", "Антонио");
        map.put("Белучи", "Моника");
        map.put("Гудини", "Гарри");
        map.put("Верди", "Джузеппе");
        map.put("Марацци", "Бруно");
        map.put("Корлионе", "Вито");
        map.put("Брацци", "Люка");
        map.put("Страдивари", "Антонио");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
       /* HashMap<String, String> temp = new HashMap<String, String>();
      //  HashSet<String> tmp = new HashSet<>();
        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); )
        {
            Map.Entry<String, String> entry = it.next();
            if (temp.containsValue(entry.getValue()))
            {
                it.remove();
            } else
            {
                temp.put(entry.getKey(), entry.getValue());
            }
        }*/


        HashSet<String> set = new HashSet<String>();
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> entry : copy.entrySet())
        {
            if (set.contains(entry.getValue()))
                removeItemFromMapByValue(map, entry.getValue());
            else
                set.add(entry.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    /*public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }*/
}
