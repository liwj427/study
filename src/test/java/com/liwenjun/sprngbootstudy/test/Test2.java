package com.liwenjun.sprngbootstudy.test;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author liwenjun
 * @Date 2021/9/2 11:07 上午
 * @Version: 1.0
 */
public interface Test2 {

    public static interface MyInterface {
        void foo();
        void fooo();
    }

    public abstract static class AbstractClass1 implements MyInterface {
        abstract void print();

        @Override
        public void foo() {
            System.out.println("foo");
        }
    }

    public static class Class2 extends AbstractClass1 {

        @Override
        public void fooo() {
            System.out.println("fooo");
        }

        @Override
        void print() {
            System.out.println("print");
        }
    }
}
