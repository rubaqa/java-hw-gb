package les02;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

public class task01 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(task01.class.getName());
        FileHandler file_log = new FileHandler("les02/log.txt");
        logger.addHandler(file_log);
        SimpleFormatter f_txt = new SimpleFormatter();
        file_log.setFormatter(f_txt);
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько элементов? ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы с новой строки:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Введенный массив: ");
        System.out.println(Arrays.toString(array));
        input.close();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    logger.log(Level.INFO, "Обмен элементов " + temp + array[j]);
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
    }
}