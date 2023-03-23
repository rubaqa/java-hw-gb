package les01;

// Вывести все простые числа от 1 до 1000

public class task02 {
    public static void main(String[] args) {
        System.out.println("Интервал 1 - 1000. Выведем простые числа из него.");
        for (int i = 2; i < 1000; i++){
            int num = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) != 0) num += 0;
                else num +=1;
            }
            if (num == 0) System.out.print(i + ", ");
        }
    }
}
