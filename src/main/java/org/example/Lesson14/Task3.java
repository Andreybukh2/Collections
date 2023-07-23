package org.example.Lesson14;

import java.util.ArrayList;
import java.util.Collections;

/**3
 1. Создай список слов, заполни его самостоятельно.
 2. Метод fix должен:
 2.1. удалять из списка строк все слова, содержащие букву "р"
 2.2. удваивать все слова содержащие букву "л".
 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 2.4. с другими словами ничего не делать.*/
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("лиса");
        strings.add("мясо");
        strings.add("рога");
        strings.add("лорингит");
        strings.add("лоза");
        strings.add("река");
        strings.add("мишка");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix (ArrayList<String> strings) {
        for (String str : (new ArrayList<>(strings)))
            if (str.contains("р"))
                strings.remove(str);
            else if (!str.contains("р") && str.contains("л"))
                strings.add(str);
        Collections.sort(strings);
        return strings;
    }
}