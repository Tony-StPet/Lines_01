// задание
//1 прочитать строки из файла в список строк
//2 получить список уникальных имен, прочитанный из файла
//3 подсчитать, сколько раз в файле содержится строка "Вася Пупкин"
//4 подсчитать, сколько в файле строк, которые начинаются на "Вася"
// 5 Взять из списка всех строк только строки короче 15 символов
//6 Отсортировать список строк, которые короче 15 символов
//7 Заменить в списке строк все буквы В на V


import java.util.List;

public class Main {
    public static void main(String[] args) {

        writeToFile();


    }

    private static void writeToFile() {
        List<Row> words = Metod.makeLines();
        Metod.printLines(words);
        Metod.writeLineToFile(words, "output.txt");
    }

}