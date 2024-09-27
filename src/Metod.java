import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// создание библиотеки методав работы с файлом записи и чтения
public class Metod {

//    public static List<Row> makeLines() {
//        List<Row> rowList = new ArrayList<>();
//        rowList.add(new Row("Вася Пупкин Антонина Сергей шел с чемоданом за грибами почтальон Печкин"));
//        rowList.add(new Row("почтальон Печкин дядя Федор пес Шарик кот Матроскин"));
//        rowList.add(new Row("кот в сапогах карабас Барабас Мальвина Пьеро Пиннокио Чиполлино"));
//        return rowList;
//    }
//
//    // запись в файл
//    public static void writeLineToFile(List<Row> rows, String filename) {
//        //в каждой строке файла будут слова, разделенные пробелами или знаками препинания
//
//        try {
//            FileWriter fileWriter = new FileWriter(filename);
//            for (Row row : rows) {
//                fileWriter.write(row.words + "\n");
//            }
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("Ошибка при записи в файл");
//            System.out.println(e.getMessage());
//        }
//    }
//
//
//    // вывод в консоль
//    public static void printLines(List<Row> words){
//        for (Row wrd: words)
//            System.out.println(wrd);
//    }


        public static List<String> readLinesFromFile(String fileName) {
            List<String> lines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lines;
        }


    }


