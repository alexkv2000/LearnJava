package home.learn.academy.section001_classes;

import java.util.Arrays;

public class DynaArrayStorage {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.result = new int[5];
        dynaArray.setCount(5);

        System.out.println(Arrays.toString(dynaArray.result));
        System.out.println(dynaArray.getCount());
    }
}
