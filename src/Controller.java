import java.util.List;

class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    // Метод для сортировки списка потоков
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
        System.out.println("Список потоков отсортирован.");
    }
}