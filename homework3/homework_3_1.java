// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));// ["string", "s", "my_value"]

package homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class homework_3_1 {
    public static void main(String[] args) {
        ArrayList<String> withoutNumbers = new ArrayList<>();
        withoutNumbers.add("build");
        withoutNumbers.add("6");
        withoutNumbers.add("pen");
        withoutNumbers.add("56");
        withoutNumbers.add("-1");
        withoutNumbers.add("step");
        withoutNumbers.add("100");
        withoutNumbers.add("77");
        Iterator<String> iterator = withoutNumbers.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (isNumeric(element)) {
                iterator.remove();
            }
        }

        System.out.println(withoutNumbers);
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}