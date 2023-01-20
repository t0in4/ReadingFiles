import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {

        // Reading Files
        String string = args[0];
        // вариант нахождения количества букв
        String wholeData = new String(Files.readAllBytes(Paths.get(string)));
        String[] dataArray = wholeData.split("[\\n\\t\\s]+");
        String string2 = String.join("", dataArray);
        System.out.println(string2.split("").length);

        // второй вариант нахождения количества букв
        int words = wholeData.split("\\s*(?<!\\d)[-?.!,:;\\s]+|[-?.!,:;\\s]+(?!\\d)\\s*").length;

        // вариант когда сохраняем в строку
        String wholeData2 = new String(Files.readAllBytes(Paths.get(string)));

        // вариант когда сохраняем в класс File
        File file = new File("C:\\Users\\user\\IdeaProjects\\ReadingFiles\\" + string);
        Scanner scanner = new Scanner(file);
        String newString = "";
        try {
            while(scanner.hasNext()) {
                //System.out.println(scanner.nextLine());
                //new;
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

        System.out.println(newString);

        /*File file2 = new File("C:\\system.tmp");
        // канонический пример
        try (Scanner scanner2 = new Scanner(file2)) {
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file2);
        }

        // работаем с многостроковым текстом
        String pathToFileInUsers = "C:\\Users\\user\\folderForFiles\\text.txt";
        // вызываю из метода
        System.out.println(readFileAsString(pathToFileInUsers));
        // вызываю непостредственно
        try {
            System.out.println(new String(Files.readAllBytes(Paths.get(pathToFileInUsers))));
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

        // запись в файл
        String message = "Added text";
        Path path = Path.of("C:\\Users\\user\\folderForFiles\\text.txt");
        Files.writeString(path, message);*/




    }
}