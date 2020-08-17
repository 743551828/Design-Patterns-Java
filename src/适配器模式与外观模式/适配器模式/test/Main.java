package 适配器模式与外观模式.适配器模式.test;

import 适配器模式与外观模式.适配器模式.code.adapter.IteratorEnumeration;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:09
 **/
public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Iterator<Integer> iterator = list.iterator();
        Enumeration iteratorEnumeration = new IteratorEnumeration<>(iterator);
        System.out.println(iteratorEnumeration.nextElement());
        System.out.println(iteratorEnumeration.nextElement());
        System.out.println(iteratorEnumeration.nextElement());
        System.out.println(iteratorEnumeration.nextElement());
        System.out.println(iteratorEnumeration.nextElement());
        System.out.println(iteratorEnumeration.nextElement());
    }

}
