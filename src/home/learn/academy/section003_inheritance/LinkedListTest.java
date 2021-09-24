package home.learn.academy.section003_inheritance;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
class LinkedListTest {
    public static void main(String[] args) {
        LinkedList secondList = new LinkedList();
        secondList.add(new int[]{4, 5, 6});

        LinkedList list = new LinkedList();
        list.add(new int[]{1, 2, 3});
        list.add(secondList);
        //list.add(4);

        System.out.println(Arrays.toString(list.toArray()));
    }
}