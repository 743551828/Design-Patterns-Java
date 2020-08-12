package 工厂模式.工厂方法模式.code.factory.impl;

import 工厂模式.工厂方法模式.code.factory.Factory;
import 工厂模式.工厂方法模式.code.reader.Reader;
import 工厂模式.工厂方法模式.code.reader.impl.PngReader;

/**
 * @author zhangys
 */
public class PngReaderFactory implements Factory {
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}