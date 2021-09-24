package home.learn.academy.test.class_queue;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class StackBasedOnArray extends BasedOnArray {
    public StackBasedOnArray(int size) {
        int[] array = new int[size];
    }


    /*    @Override
        public int get() {
            if (size() > 0) {
                return array[--countarray];
            } else {
                return new RuntimeException("Stack is empty");
            }
        }*/
}
