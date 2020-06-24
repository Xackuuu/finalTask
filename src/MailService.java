import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<MailBox> {

    private Map<String, List<T>> map = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<>());
        }
    };

    public Map<String, List<T>> getMailBox() {
        return map;
    }

    @Override
    public void accept(MailBox mailBox) {
        if (!map.containsKey(mailBox.getTo())) {
            map.put(mailBox.getTo(), new ArrayList<>());
        }
        map.get(mailBox.getTo()).add((T) mailBox.getContent());
    }
}
