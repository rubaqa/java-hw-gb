package les02;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
//  Без встр. функций

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Прошу ввести строки на проверку на полиндром: ");
        String str = input.nextLine();
        System.out.println(palindrom(str));
        input.close();
    }

    static boolean palindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
