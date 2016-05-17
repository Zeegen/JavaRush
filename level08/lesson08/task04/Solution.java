package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {

        HashMap<String, Date> date = createMap();
        removeAllSummerPeople(date);

        for (Map.Entry<String, Date> sa : date.entrySet())
        {
            System.out.println(sa.getKey() + " : " + sa.getValue());
        }
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Dima", new Date("JULY 3 1981"));
        map.put("Marina", new Date("MAY 4 1978"));
        map.put("Figi", new Date(("OCTOBER 5 1977")));
        map.put("Sterh", new Date(("NOVEMBER 5 1980")));
        map.put("Fest", new Date(("SEPTEMBER 5 1967")));
        map.put("Light", new Date(("SEPTEMBER 5 1967")));
        map.put("Szae", new Date(("SEPTEMBER 5 1967")));
        map.put("AS", new Date(("SEPTEMBER 5 1967")));
        map.put("KoDCVFrlu", new Date(("SEPTEMBER 5 1967")));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
 /*       for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); )
        {

            Map.Entry<String, Date> entry = it.next();
            if (entry.getValue().getMonth() > 4 & entry.getValue().getMonth() < 8)
            {
                it.remove();
            }
        }

*/
        for (Map.Entry<String, Date> it : map.entrySet())
        {
            if (it.getValue().getMonth() > 4 & it.getValue().getMonth() < 8)
            {
                map.remove(it);
            }
        }

    }
}
