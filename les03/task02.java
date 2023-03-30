// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package les03;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        Random  rdm = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    for (int i = 0; i < 15; i++){
        list1.add(rdm.nextInt(10, 30));
    }
    System.out.println(list1);
    list1.sort(Comparator.naturalOrder());
    int min_num = list1.get(0);
    int max_num = list1.get(list1.size()-1);
    System.out.print("Min - " + min_num);
    System.out.print(". Max - " + max_num);
    int sum = 0;
    for (int i = 1; i < list1.size(); i++){
        sum = sum + list1.get(i);
        }
    Double size_arr = (double) list1.size();
    Double midle_arifmenic = ((double) sum)/ size_arr;   
    System.out.println(". Average - " + midle_arifmenic);
    }
}
