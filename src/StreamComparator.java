import java.util.Comparator;

class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.getGroupCount(), stream2.getGroupCount());
    }
}