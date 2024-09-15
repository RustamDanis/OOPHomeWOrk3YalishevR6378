import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем учебные группы
        StudyGroup group1 = new StudyGroup("Группа 1");
        StudyGroup group2 = new StudyGroup("Группа 2");
        StudyGroup group3 = new StudyGroup("Группа 3");

        // Создаем потоки
        Stream stream1 = new Stream(Arrays.asList(group1, group2));
        Stream stream2 = new Stream(Arrays.asList(group1));
        Stream stream3 = new Stream(Arrays.asList(group1, group2, group3));

        // Список потоков
        List<Stream> streams = Arrays.asList(stream1, stream2, stream3);

        // Создаем сервис и контроллер
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем потоки
        controller.sortStreams(streams);

        // Выводим результат
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroupCount() + " группами");
        }
    }
}