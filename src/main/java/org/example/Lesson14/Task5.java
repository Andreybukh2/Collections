package org.example.Lesson14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 1. Введи с клавиатуры 10 слов в список строк.
 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность. */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringArrayList.add(scanner.nextLine());
        }
        int a = -1, b = 0;
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (i != (stringArrayList.size() - 1)) {
                b = i + 1; }
            if (stringArrayList.get(i).length() > stringArrayList.get(b).length()) {
                a = i;
                i = stringArrayList.size();
            }
        }
        if (a != -1) System.out.println(a);
    }
}
