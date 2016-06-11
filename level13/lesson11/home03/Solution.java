package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String msg = reader.readLine();

        /*
        InputStream stream = new FileInputStream(msg);
        while (stream.available() > 0) System.out.println(stream.);
        stream.close();
        */

        FileReader fr = new FileReader(msg);
        Scanner src = new Scanner(fr);

        while (src.hasNext()) {
            if(src.hasNextInt()) {
                System.out.println(src.nextInt());
            } else if (src.hasNextDouble()) {
                System.out.println(src.nextDouble());
            } else if (src.hasNextBoolean()) {
                System.out.println(src.nextBoolean());
            } else {
                System.out.println(src.next());
            }
        }

        src.close();

    }
}
