/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

package homework5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class homework5 {
    public static void main(String[] arg){
        collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");

    }
    static void collectStats(String text) {
        List<String> listStr = Arrays.asList(text.split(" "));
        Map<Integer, List<String>> stats = new HashMap<>();
        listStr.forEach(str -> {
            stats.merge(str.length(), Arrays.asList(str),
                    (oldList, newList) -> Stream.concat(oldList.stream(), newList.stream()) // <--*
                            .collect(Collectors.toList()));
        });
        stats.forEach((key, volues) -> System.out.println(Arrays.toString(volues.toArray())));
        
    }
} 
    


