package com.liwenjun.sprngbootstudy.test.sort;

/**
 * @ClassName DiGuiTest
 * @Description TODO
 * @Author liwenjun
 * @Date 2021/8/18 4:23 下午
 * @Version: 1.0
 */
public class DiGuiTest {

    public static void main(String[] args) {

        rec(11);
    }

    public static void rec(int N){
        if (N > 0) {
            rec(N - 10);
            rec(N - 1);
        }
        System.out.println(N);
        System.out.println("*******");
    }
}
