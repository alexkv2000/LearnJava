package home.learn.academy.Test_ather;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class OOP {
    public static void main(final String[] args) {
        final Class1 class1 = new Class1(new Class2(25));
        class1.doSomething1();
    }

    private interface Interface {

        void doSomething2();
    }

    private static class Class1 {

        private Interface object;

        public Class1(final Interface object) {
            this.object = object;
        }

        public void doSomething1() {
            object.doSomething2();
        }
    }

    private static class Class2 implements Interface {

        private int value;

        public Class2(final int value) {
            this.value = value;
        }

        @Override
        public void doSomething2() {
            System.out.println(value);
        }
    }
}