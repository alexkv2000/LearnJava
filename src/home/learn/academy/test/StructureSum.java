package home.learn.academy.test;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public interface StructureSum {
    void add(int element);
    void add(int index, int element);
    long getCurrentElement(int element);
    long getCurrentElement();
    int countElements();
    String asString();
    Long sum();
}
