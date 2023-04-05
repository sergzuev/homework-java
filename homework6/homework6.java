/*
 * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
 */
package homework6;

import java.util.ArrayList;

public class homework6 {
    public static void main(String[] args) {

        // ArrayList<String[]> workers = new ArrayList<>();
        ArrayList<person> workers = new ArrayList<>();

        person work1 = new person("Зуев", "Сергей", "28", "муж", "инженер", "Архангельск");
        person work2 = new person("Хазов", "Михаил", "24", "муж", "токарь", "Москва");
        person work3 = new person("Исаева", "Дарья", "19", "жен", "бухгалтер", "Истра");
        person work4 = new person("Горинов", "Никита", "20", "муж", "наладчик", "Звенигород");
        person work5 = new person("Мишина", "Елена", "46", "жен", "экономист", "Москва");
        person work6 = new person("Кочетов", "Алексей", "30", "муж", "слесарь", "Звенигород");
        
        workers.add(work1); 
        workers.add(work2); 
        workers.add(work3); 
        workers.add(work4); 
        workers.add(work5); 
        workers.add(work6);

        for (person work : workers) {
            if (Integer.parseInt(work.age) > 20) {
                System.out.println(work);
            }
            
        }

        System.out.println(work1.name.equals(work3.name));
        System.out.println(work2.surname.hashCode());
        System.out.println(work6.surname.hashCode());

    }

}