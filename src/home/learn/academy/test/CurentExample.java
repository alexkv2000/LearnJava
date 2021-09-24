package home.learn.academy.test;

/**
 * @author kvochkin
 * @ ссылка http://skladOf.net
 **/
public class CurentExample {

    public static void main(String[] args) {
        Parent parent = new Child1();
        parent.doSomething();
        System.out.println(Child2.class);
//        System.out.println(Child1.class);
        System.out.println(parent.getClass());
        System.out.println();

   }

    private interface Parent {

        void doSomething();
    }

    private static class Child1 implements Parent {

        @Override
        public void doSomething() {
            System.out.println("case 1");
        }
    }

    private static class Child2 implements Parent {

        @Override
        public void doSomething() {
            System.out.println("case 2");
        }
    }
}

