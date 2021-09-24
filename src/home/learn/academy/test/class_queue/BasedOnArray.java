package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class BasedOnArray extends BaseDataStorage {
    protected int[] array;

    public BasedOnArray(int size) {
        array = new int[size];
    }

    public BasedOnArray() {
        this(5);
    }

    @Override
    protected void addNextElement(Item item) {

    }

    @Override
    protected RuntimeException ErEmptyException(String queue_is_empty) {
        return null;
    }

    @Override
    public final void add(int value) {
        if (size == array.length) {
            grow(array.length == 0 ? 5 : size * 2);  //увеличиваем массив в два раза
        }
        array[size++] = value;
    }

    private void grow(int length) {
        int[] newArray = new int[length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

}
