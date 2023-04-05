/*
 * Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке.
Если введено exit, завершаем программу
Пример:
string~4
num~3
print~3
num
print~4
string
my_value~1
print~1
my_value
 */

package homework4;

import java.util.ArrayList;
import java.util.Scanner;
public class homework4 {
    public static void main(String[] args) {
        System.out.println(
                "Введите несколько строк  формата text~num."+
                " Нажимайте Enter после каждой строки, где num - числовой индекс.");
        System.out.println(
                " Для вывода строки с нужным индексом - введите print~num."+
                " Для завершения программы введите exit");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] parts = input.split("~");

            if (parts.length == 2) {
                String text = parts[0];
                int num = Integer.parseInt(parts[1]);
                while (list.size() <= num)
                    list.add(null);
                if (text.equals("print")) {
                    System.out.println(list.get(num));
                } else {
                    list.add(num, text);
                }
            }
        }

        scanner.close();
    }
}
    

