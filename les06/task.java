package les06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/

public class task {
    public static void main(String[] args) {
        Set<Notebook> catalogNotebook = new HashSet<>();

        Notebook nb1 = new Notebook(4,480,"Win 7","Grey", "Asus","Intel Core i3",14.0);
        Notebook nb2 = new Notebook(8,1000,"Win 8.1","Black","MSI","Intel Core i5",14.5);
        Notebook nb3 = new Notebook(16,1536,"Win 10", "White","Huawei","Intel Core i7",15.0);
        Notebook nb4 = new Notebook(32,2048,"Win 11","Red","Lenovo","Intel Core i9",15.6);
        Notebook nb5 = new Notebook(12,612,"Ubuntu","Black","HP","AMD A6",16.0);
        catalogNotebook.add(nb1);
        catalogNotebook.add(nb2);
        catalogNotebook.add(nb3);
        catalogNotebook.add(nb4);
        catalogNotebook.add(nb5);

        System.out.println("Выберите один из вариантов сортировки:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объём жёсткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Iterator<Notebook> it = catalogNotebook.iterator();
        Scanner inputSort = new Scanner(System.in, "Cp866");
        Integer sortBy = inputSort.nextInt();
        
        if (sortBy == 1) {
            System.out.println("Минимальное количество ОЗУ в Гб? ");
            Integer ram_sort = inputSort.nextInt();
            for (Notebook item : catalogNotebook) {
                if (item.getramVolume() >= ram_sort) {
                    System.out.println(item);
                }
            }
        }

        if (sortBy == 2) {
            System.out.println("Минимальный размер хранилища в Гб? ");
            Integer v_hdd_sort = inputSort.nextInt();
            while (it.hasNext()) {
                Notebook hdd = it.next();
                if (hdd.getstorageVolume() >= v_hdd_sort) {
                    System.out.println(hdd);
                }
                
            }
        }

        if (sortBy == 3) {
            System.out.println("Какую операционную систему хотите? ");
            String o_s_sort = inputSort.next();
            for (Notebook item : catalogNotebook) {
                if (item.getOSver().contains(o_s_sort)) {
                    System.out.println(item);
                }
                
            }
        }

        if (sortBy == 4) {
            System.out.println("Какого цвета нужен? ");
            String color_sort = inputSort.next();
            for (Notebook item : catalogNotebook) {
                if (item.getColor().contains(color_sort)) {
                    System.out.println(item);
                }
                
            }
            
        }
        inputSort.close();
    }
}
