package org.example.sem3.hw4;
// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Collections;
public class Hw4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(25);
        arrayList.add(34);
        arrayList.add(46);
        arrayList.add(59);

        int min = Collections.min(arrayList);
        System.out.println("Минимальное значение: " + min);

        int max = Collections.max(arrayList);
        System.out.println("Максимальное значение: " + max);

        double sum = 0;
        for (int number : arrayList) {
            sum += number;
        }
        double average = sum / arrayList.size();
        System.out.println("Среднее значение: " + average);
    }
}

