package home.learn.academy.section002_list;

import java.util.Arrays;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class LinkedListTest {
        public static void main(String[] args) {
            LinkedList secondList = new LinkedList();
            secondList.add(new int[]{4, 5, 6});
            secondList.add(new int[]{7, 8, 9});

            LinkedList list = new LinkedList();
            list.add(new int[]{1, 2, 3});
            list.add(secondList);


            System.out.println(Arrays.toString(list.toArray()));
            //[1, 2, 3, 4, 5, 6]
            System.out.println(list.asString());
        }

    }
