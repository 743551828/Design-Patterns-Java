package 工厂模式.工厂方法模式.test;

import 工厂模式.工厂方法模式.code.factory.Factory;
import 工厂模式.工厂方法模式.code.factory.impl.JpgFactory;
import 工厂模式.工厂方法模式.code.reader.Reader;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 11:17
 **/
public class Main {

    public static void main(String[] args) {
        Factory jpgFactory=new JpgFactory();
        Reader reader=jpgFactory.getReader();
        reader.read();
    }
}
