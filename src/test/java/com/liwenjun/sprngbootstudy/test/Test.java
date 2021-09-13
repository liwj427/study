package com.liwenjun.sprngbootstudy.test;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liwenjun
 * @Date 2021/8/18 5:41 下午
 * @Version: 1.0
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test1() {
        String str = "中国啊";
//        PinyinUtils.getPinyinByZh(str);
        System.out.println(str.substring(0, str.length() >= 4 ? 4 : str.length()));
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void tets2() {
        String str = " 12 3@163.com ";
        String s = str.trim();
        System.out.println(str);
        System.out.println(s);
    }


    public static void main(String[] args) {
//        String str = " 1 2  3@163.com ";
//        String s1 = str.trim();
//        String s2 = str.replaceAll(" ", "");
//        System.out.println(str);
//        System.out.println(s1);
//        System.out.println(s2);

        //(n-1)&hash
        // 当n=8
        int aaaa = hash("hghjgjh");
        System.out.println(aaaa);
        System.out.println(7&aaaa);
        System.out.println(15&aaaa);


    }

    private static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
