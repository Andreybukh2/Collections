package org.example.Lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 1
 * Введи с клавиатуры 5 слов в список строк.
 * Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.*/
public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Слово1");
        stringList.add("Слово2");
        stringList.add("Слово3");
        stringList.add("Слово4");
        stringList.add("Слово5");

        System.out.println("********** Сортировка A-Z **********");
        for (String wordsAsc : stringList ) {
            System.out.println(wordsAsc);
        }
        stringList.remove(3);

        System.out.println("********** Сортировка Z-A **********");
        Collections.sort(stringList,Collections.<String>reverseOrder());
        for (String wordsDesc : stringList) {
            System.out.println(wordsDesc);
        }
    }
}
