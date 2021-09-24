package home.learn.academy.section001_classes;

import java.util.Arrays;

public class DynaArray {

    public int[] result;

    private int count;

    public int getCount(){
        return  count;
    }

    public DynaArray() {
        this(5);
    }

    public DynaArray(int size) {
        if (size == 0) {
            size=5;
        }
        result = new int[size];
    }

    public void add(int value) {
        if (count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count++] = value;
    }

    public void add(int[] array) {
        add(array, array.length);
    }

    public void add(DynaArray dynaArray) {
        add(dynaArray.result, dynaArray.count);
    }

    private void add(int[] array, int length) {
        if (result.length - count < length) {
            grow(count + length);
        }
        System.arraycopy(array, 0, result, count, length);
        count += length;
    }

    private void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    public String asString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public void setCount(int count) {
        this.count = count;
    }
}