package 工厂模式.工厂方法模式.code.reader.impl;

import 工厂模式.工厂方法模式.code.reader.Reader;

public class PngReader implements Reader {
    @Override
    public void read() {
        System.out.print("read png");
    }
}