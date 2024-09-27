import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

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


    public static Set<String> getUniqueNames(String fileName) {
        Set<String> uniqueNames = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                for (String name : parts) {
                    uniqueNames.add(name.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueNames;
    }

//3 подсчитать, сколько раз в файле содержится строка "Вася Пупкин"
    //подсчет простым обходом
    public static int countLine(String fileName, String targetLine) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(targetLine)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    //подсчет методом стрим Stream API
    public static int countLine2(String fileName, String targetLine) {
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            return (int) lines.filter(line -> line.contains(targetLine))
                    .count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

//4 подсчитать, сколько в файле строк, которые начинаются на "Вася"






}

