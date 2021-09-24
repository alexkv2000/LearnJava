package home.learn.academy.Test_ather;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class Ather {

    public static class GrandPa {
        int valueGrandPa;

        public GrandPa() {
            this.valueGrandPa=0;
        }

        public GrandPa(int value) {
            this.valueGrandPa = value;
        }
    }

    public static class Parent extends GrandPa{
    int intValueParent;
        public Parent() {
            super();
            this.intValueParent = 0;
        }

        public Parent(int value) {
            super(value);
            this.intValueParent =value+1;
        }
    }

    public static class Child extends Parent {
        public Child(int value) {
            super(value);
        }
    }

    public static void main(String[] args) {
        Child ch = new Child(12);

        System.out.println(ch.valueGrandPa);
        System.out.println(ch.intValueParent);
    }
}