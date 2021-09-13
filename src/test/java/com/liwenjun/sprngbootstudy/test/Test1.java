package com.liwenjun.sprngbootstudy.test;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author liwenjun
 * @Date 2021/9/2 10:39 上午
 * @Version: 1.0
 */
public class Test1 {

    public static interface MyInterface {
        void foo();
    }

    public static class BaseClass implements MyInterface, Cloneable, Serializable {

        @Override
        public void foo() {
            System.out.println("BaseClass.foo");
        }
    }

    public static class Class1 extends BaseClass {

        @Override
        public void foo() {
            super.foo();
            System.out.println("Class1.foo");
        }
    }

    static class Class2 extends BaseClass implements MyInterface, Cloneable,
            Serializable {

        @Override
        public void foo() {
            super.foo();
            System.out.println("Class2.foo");
        }
    }

    private static void showInterfacesFor(Class<?> clazz) {
        System.out.printf("%s --> %s\n", clazz, Arrays.toString(clazz
                .getInterfaces()));
    }

    public static void main(String[] args) {
        showInterfacesFor(BaseClass.class);
        showInterfacesFor(Class1.class);
        showInterfacesFor(Class2.class);

    }
}

