package ua.javarush.task.jdk13.task21.task2105;

/* 
Заборонити клонування
*/

public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {
        C c = new C(5, 7, "hello");
        System.out.println(c);
        System.out.println(c.clone());
        B b = new B(11, 12, "test");
        System.out.println(b);
        System.out.println(b.clone());
        A a = new A(22, 33);
        System.out.println(a);
        System.out.println(a.clone());
    }

    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new C(getI(), getJ(), getName());
        }
    }
}
