/*
 * Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
 */
package homework3;

import java.util.ArrayList;

public class homework_3_0 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(24);
        numbers.add(3);
        numbers.add(2);
        numbers.add(44);
        System.out.println("Начальный список чисел: " + numbers);
        numbers.removeIf(x -> (x % 2) != 0);;
        System.out.println("Список с удалеными из него нечетными числами: " + numbers);
    }
}