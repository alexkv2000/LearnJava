package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public final class QueueBasedOnLinkedList extends BaseDataStorage {
    protected Item last;

    @Override
    protected void addNextElement(Item item) {
        if (last == null) {
            last = first;
        }
        last.item = item;
        last = item;
        size++;
    }

    @Override
    public int get() {
        int result = super.get();
        if(last==null) {
            last=null;
        }
        return result;
    }

    @Override
    protected RuntimeException ErEmptyException(String queue_is_empty) {
        return new RuntimeException("Queue is empty!");
    }
}
