package com.kuang.test;

import com.sun.corba.se.impl.orb.ParserTable;
import sun.tracing.PrintStreamProviderFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhuchengbo
 * @create 2020-03-29-17:39
 */
public class Demo02 {
    //模板六: prsf: 可生成private static final
    //private static final
    //变形：psf
    //public static final
    //变形：psfi
    //public static final int
    //变形：psfs
    //public static final String
    public static final int  = ;

public void test(){

}

    //psvm
    public static void main(String[] args) {



        //sout打印到控制台
        System.out.println();
        //soutp打印方法的形参
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm打印方法的名字
        System.out.println("Demo02.main");
        //soutv打印方法的变量
        System.out.println("args = " + args);
        //args.sout输出args
        System.out.println(args);

        //模板三: fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //模板四: list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {
        }
        //inn
        if (list != null) {
        }
        //变形xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }



        for (Object o : list) {
            
        }
        //list.fori for循环
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

}

