package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public abstract class QueueBasedOnArray extends BasedOnArray {
    public QueueBasedOnArray(int size) {
        super(size);
    }

    public QueueBasedOnArray() {
        super();
    }

    @Override
    protected RuntimeException ErEmptyException(String queue_is_empty) {
        return ErEmptyException("Queue is empty");
    }

/*    @Override
    public int get() {
        if (size() > 0) {
            int result = array[0];
            System.arraycopy(array, 1, array, 0, array.length-1);
            countarray--;
            return result;
        } else {
            return new RuntimeException("Queue is empty") ;
        }
    }*/

    protected int getIfNotEmpty() {
        int result = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        size--;
        return result;
    }

    @Override
    protected abstract void addNextElement(Item item);
}
