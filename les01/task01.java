package les01;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5 
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;
public class task01 {
    static int sum(int num){
        int sum = 0;
        while (num>0) sum = sum + (num--);
        return sum;
    }
    static int factor(int num){
        if (num == 1) return 1;
        else return num * factor(num - 1);
    }


    public static void main(String[] args) {
        Scanner iScanner= new Scanner(System.in);
        System.out.println("Дайте целое число: ");
        int num = iScanner.nextInt();
        System.out.printf("Треугольное число из %d равно: " + sum(num)+"\n",num);
        System.out.printf("Факториал из !%d равно: " + factor(num), num); 
        iScanner.close();      
    }   
}