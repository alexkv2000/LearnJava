package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Item {
    int value;
    Item item;

    public Item(int value) {
        this.value = value;
    }

    public Item() {
        this(0);
    }
}
