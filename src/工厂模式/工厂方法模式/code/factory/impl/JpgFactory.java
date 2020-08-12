package 工厂模式.工厂方法模式.code.factory.impl;

import 工厂模式.工厂方法模式.code.factory.Factory;
import 工厂模式.工厂方法模式.code.reader.Reader;
import 工厂模式.工厂方法模式.code.reader.impl.JpgReader;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 13:55
 **/
public class JpgFactory implements Factory {
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
