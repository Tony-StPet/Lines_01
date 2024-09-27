// задание
//1 прочитать строки из файла в список строк
//2 получить список уникальных имен, прочитанный из файла
//3 подсчитать, сколько раз в файле содержится строка "Вася Пупкин"
//4 подсчитать, сколько в файле строк, которые начинаются на "Вася"
// 5 Взять из списка всех строк только строки короче 15 символов
//6 Отсортировать список строк, которые короче 15 символов
//7 Заменить в списке строк все буквы В на V


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            String fileName = "output.txt"; // Замените на фактическое имя файла
            List<String> fileLines = Metod.readLinesFromFile(fileName);
            for (String line : fileLines) {
                System.out.println(line);
            }



    }

//    private static void writeToFile() {
//        List<Row> words = Metod.makeLines();
//        Metod.printLines(words);
//        Metod.writeLineToFile(words, "output.txt");
//    }



}