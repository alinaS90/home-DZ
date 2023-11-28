package ru.sberbank.jd.lesson07;

import java.util.Comparator;

/**
 * Класс, определяющий порядок четных и нечетных чисел.
 */
public class CustomDigitComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        boolean aIsEven = a % 2 == 0;
        boolean bIsEven = b % 2 == 0;

        if (aIsEven && !bIsEven) {
            return -1;
        }
        if (!aIsEven && bIsEven) {
            return 1;
        }
        return a.compareTo(b);
    }
}
