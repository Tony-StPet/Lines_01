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
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String fileName = "a.txt"; // Замените на фактическое имя файла

//  System.out.println("читаем вайл и выводим строки ");
//            List<String> fileLines = Metod.readLinesFromFile(fileName);
//            for (String line : fileLines) {
//                System.out.println(line);
//   }
//    System.out.println("Выведем список уникальных значений");
//        Set<String> uniqueNames = Metod.getUniqueNames(fileName);
//        for (String name : uniqueNames) {
//            System.out.println(name);
//    }


//        System.out.println("подсчитать, сколько раз в файле содержится строка:: Вася Пупкин");
//        String targetLine = "Вася Пупкин";
//        int lineCount = Metod.countLine2(fileName, targetLine);
//        System.out.println("Строка \"" + targetLine + "\" встречается " + lineCount + " раз(а) в файле.");

//        System.out.println("подсчитать, сколько в файле строк, которые начинаются на:: Вася");
//        String prefix = "Вася";
//        int lineCount = Metod.countLinesStartingWith(fileName, prefix);
//        System.out.println("Количество строк, начинающихся с \"" + prefix + "\": " + lineCount);

//        System.out.println("Взять из списка всех строк только строки короче 15 символов");
//        List<String> shortLines = Metod.getShortLines(fileName);
//        shortLines.forEach(System.out::println);

//        System.out.println("Отсортировать список строк, которые короче 15 символов");
//        List<String> shortLines2 = Metod.getShortLinesSorted(fileName);
//        shortLines2.forEach(System.out::println);
//
//        System.out.println("Отсортировать список строк, которые короче 15 символов - по кол-ву символов");
//        List<String> shortLines = Metod.getShortLinesSortedByLength(fileName);
//        shortLines.forEach(System.out::println);

        System.out.println("Заменить в списке строк все буквы В на V  ");
        List<String> fileLines = Metod.readLinesFromFile(fileName);
        for (String line : fileLines) {
            System.out.println(line.replace('В', 'V'));
        }


    }





//    private static void writeToFile() {
//        List<Row> words = Metod.makeLines();
//        Metod.printLines(words);
//        Metod.writeLineToFile(words, "output.txt");
//    }
}
