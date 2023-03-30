// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package les03;
import java.util.ArrayList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
    Random  randm = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 15; i++){
        list.add(randm.nextInt(10, 30));
    }
    System.out.println(list);
    for (int i = list.size()-1; i >= 0; i--){
        if (list.get(i) % 2==0){
            list.remove(i);
        }
    }
    System.out.print(list);
    }
}
