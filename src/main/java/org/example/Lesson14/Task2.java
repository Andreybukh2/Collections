package org.example.Lesson14;
/** 2
 * 1. Создай список из слов "мама", "мыла", "раму".
   2. После каждого слова вставь в список строку, содержащую слово "именно".
   3. Вывести результат на экран, каждый элемент списка с новой строки.*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(5);
        stringList.add("Мама");
        stringList.add("Мыла");
        stringList.add("Раму");

        String word = "именно";
        for (int i = 0; i < stringList.size(); i++) {
            stringList.add(i + 1, word); i++; // i = 1, 3, 5;
        }
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
