package home.learn.academy.test;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Sum implements StructureSum {
    long sum;
    private int current;
    int count;
    int[] array;
    int size = 5;

    public Sum(int size) {
        this.size = size;
        this.array = new int[this.size];
    }

    public Sum() {
        this.array = new int[this.size];
    }


    @Override
    public void add(int element) {
        array[current++] = element;
        sum += element;
        count++;
    }
    public void add(int index, int element){

        if (index>=current){
            add(element);
        } else {
            sum-=  array[index];
            array[index] = element;
            sum += element;
        }

    }

    @Override
    public long getCurrentElement(int element) {
        long str = (array.length > element? array[element]: 0);
        return str;
    }
    public long getCurrentElement() {
        return current;
    }

    @Override
    public int countElements() {
        return count;
    }

    @Override
    public String asString() {
        String str ="";
        for (int el=0; el<count;el++) {
            str+= String.valueOf(array[el]);
        }
        return str;
    }

    @Override
    public Long sum() {
        return this.sum;
    }

}
