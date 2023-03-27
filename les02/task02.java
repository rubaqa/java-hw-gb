package les02;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task02 {
    public static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileInputStream fileStream = new FileInputStream(new File(path));
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + System.lineSeparator());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "les02/input_task2.txt";
        String text_from_file = "";
        try {
            text_from_file = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder sb1 = new StringBuilder();
        for (char i : text_from_file.toCharArray()) {
            if (i != '\"') {
                sb1.append(i);
            }
        }
        System.out.print(sb1);
        System.out.println();
        String str_sb1 = sb1.toString();
        str_sb1 = str_sb1.replaceAll("[:,\r]", " ");
        String str_sb2 = str_sb1.replaceAll("фамилия", "Студент");
        String str_sb3 = str_sb2.replaceAll("оценка", "получил");
        String str_sb4 = str_sb3.replaceAll("предмет", "по предмету");
        System.out.print(str_sb4);
    }
}
