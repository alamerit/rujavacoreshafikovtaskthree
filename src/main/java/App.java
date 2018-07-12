
import java.util.*;

/**
 @author Shafikov Almir
 * 1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 * Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get().
 *
 */
public class App  {
    public static void main(String[] args) {
        String[] array = {"Java", "GeekBrains", "Task", "String", "Integer", "System", "System", "array", "array", "HashSet"};
        System.out.println(Arrays.toString(array) + "\n");

        Map<String, Integer> siv = new HashMap<>();
        for (String arra : array) {
            siv.put(arra, siv.getOrDefault(arra, 0) + 1); }
        System.out.println(siv+"\n");


        Set<String> uniq = new HashSet<>(Arrays.asList(array));
        System.out.println(uniq);

        Phonesblok pb = new Phonesblok();
        pb.add("Bob", "11111");
        pb.add("Sam", "22222");
        pb.add("Stiv", "33333");
        pb.add("Genry", "44444");

        System.out.println("\n"+pb.get("Bob"));
    }
}