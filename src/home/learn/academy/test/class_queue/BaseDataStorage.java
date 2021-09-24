package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public abstract class BaseDataStorage implements DataStorage {
    int size;
    protected Item first;

    public final int size() {
        return size;
    }

    @Override
    public int get() {
        int result;
        if(size != 0) {
            result = first.value;
            first = first.item;
            size--;
            return result;
        } else {
            throw ErEmptyException("... is empty");
        }
    }
    protected abstract RuntimeException ErEmptyException(String queue_is_empty);

    @Override
    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = item;
            size++;
        } else {
            addNextElement(item);
        }
    }

    protected abstract void addNextElement(Item item);
}
