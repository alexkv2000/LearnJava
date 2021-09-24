package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public final class StackBasedOnLinkedList extends BaseDataStorage{

    @Override
    protected void addNextElement(Item item) {
        item.item = first;
        first = item;
        size++;
    }

    protected RuntimeException ErEmptyException(String queue_is_empty) {
        return new RuntimeException("Stack is empty!");
    }
}
