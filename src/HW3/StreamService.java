package HW3;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    public List<Stream> stream = new ArrayList<>();
    public void sortStreams(List<Stream> stream) {
        StreamComparator comparator = new StreamComparator();
        stream.sort(comparator);
    }
    void addStream (Stream stream){
        this.stream.add(stream);
    }

    public List<Stream> getStream() {
        return stream;
    }

}
