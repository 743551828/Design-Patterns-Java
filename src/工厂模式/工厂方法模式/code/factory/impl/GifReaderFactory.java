package 工厂模式.工厂方法模式.code.factory.impl;

import 工厂模式.工厂方法模式.code.factory.Factory;
import 工厂模式.工厂方法模式.code.reader.Reader;
import 工厂模式.工厂方法模式.code.reader.impl.GifReader;

/**
 * @author zhangys
 */
public class GifReaderFactory implements Factory {
    @Override
    public Reader getReader() {
        return new GifReader();
    }
}