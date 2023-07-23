package org.example.Lesson14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 1. Введи с клавиатуры 10 слов в список строк.
 2. Метод doubleValues должен удваивать слова по принципу:
 "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 3. Выведи результат на экран, каждое значение с новой строки. */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            stringArrayList.add(scanner.nextLine());

        ArrayList<String> result = doubleValues(stringArrayList);

        for (String s : result)
            System.out.println(s);
    }
    public static ArrayList<String> doubleValues (ArrayList<String> arrayList) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 10; i++){
            arrayList.add(x, arrayList.get(y));
            x+=2;
            y+=2;
        }
        return arrayList;
    }
}

