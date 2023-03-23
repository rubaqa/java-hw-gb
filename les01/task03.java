package les01;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;
public class task03 {
    public static void main(String[] args){
        Scanner iScanner= new Scanner(System.in);
        System.out.print("Первое число? ");
        int num1 = iScanner.nextInt();
        System.out.print("Арифметическое действие(+-/*)? ");
        char znak = iScanner.next().charAt(0);
        System.out.print("Второе число? ");
        int num2 = iScanner.nextInt();
        System.out.print("Результа такой - ");
        if      (znak == '+') System.out.print((num1 + num2));
        else if (znak == '-') System.out.print((num1 - num2));
        else if (znak == '/') System.out.print((num1 / num2));
        else if (znak == '*') System.out.print((num1 * num2));
        iScanner.close();
    }
}
