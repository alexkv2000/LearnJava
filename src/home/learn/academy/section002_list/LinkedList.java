package home.learn.academy.section002_list;

import home.learn.academy.section003_inheritance.DynaArray;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class LinkedList {
    private Item first;
    private Item last;
    private int count;

    public void add(int value) {
        Item item = new Item(value);
        count++;

        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
    }

    public void add(int[] array) {
        for (int element : array) {
            add(element);
        }
    }

    public void add(DynaArray dynaArray) {
        add(dynaArray.toArray());
    }

    public void add(LinkedList secondList) {
        if (secondList.count > 0) {
            if (first == null) {
                first = secondList.first;
            } else {
                this.last.next = secondList.first;
            }
            this.last = secondList.last;
            this.count += secondList.count;
        }
    }

    public int[] toArray() {
        int[] array = new int[count];

        Item current = first;
        int index = 0;
        while (current != null) {

            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public String asString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        LinkedList newll = new LinkedList();
        //вставка динамического массива
        newll.first = this.first;
        while (newll.first != null && newll.count < count) {
            str.append(newll.first.value);
            if (newll.first != this.last) {
                str.append(" ");
            }
            newll.first = newll.first.next;
            newll.count++;
        }
        //
        return str.append("]").toString();
    }

    boolean remove(int element) {
        Pair pair = findPair(element);
        if (pair != null) {
            if (pair.current == first && pair.current == last) { //если только ОДИН единственный Элемент
                first = null;
                last = null;
            } else if (pair.current == first) {  //если ПЕРВЫЙ элемент
                first = pair.current.next;
            } else {
                pair.previous.next = pair.current.next;  //если в середине списка
                if (pair.current == last) { //если Последний элемент
                    last = pair.previous; //обновляем ссылку на last
                }
            }
            count--;
            return true;
        }
        return false;
    }

    private Pair findPair(int element) {
        Item previous = first;
        Item current = first;

        while (current != null) {   //если есть значения
            if (current.value == element) {   //если найден элемент
                return new Pair(previous, current);  //возврат пары
            } else {
                previous = current; //переход на новый элемент
                current = current.next;
            }
        }
        return null;
    }

    public int size() {
        return count;
    }

    public boolean contains1(int element) {
        Item current = first;
        while (current != null) {
            if (current.value == element) {
                return true;
            } else {
                current = current.next;
            }

        }
        return false;
    }

    public boolean contains(int element) {
        return findPair(element) != null;
    }

    public class Pair {
        Item previous;
        Item current;

        public Pair(Item previous, Item current) {
            this.previous = previous;
            this.current = current;
        }
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
        //last=null;
    }
}
