package 迭代器与组合模式.test;

import 迭代器与组合模式.code.impl.NameRepository;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-18 16:34
 **/
public class Main {

    public static void main(String[] args) {


        NameRepository a = new NameRepository(new String[]{"11", "21", "31"});
        NameRepository b = new NameRepository(new String[]{"21", "22", "23"});
        NameRepository c = new NameRepository(new String[]{"31", "32", "33"});

        NameRepository r = new NameRepository(new String[]{"a", "b", "c"});
        List<NameRepository> nameRepositoryList = Arrays.asList(a, b, c);
        r.setNameRepositoryList(nameRepositoryList);

        System.out.println(r);


    }
}
