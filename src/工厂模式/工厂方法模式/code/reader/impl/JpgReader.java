package 工厂模式.工厂方法模式.code.reader.impl;

import 工厂模式.工厂方法模式.code.reader.Reader;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 13:51
 **/
public class JpgReader implements Reader {
    @Override
    public void read() {
        System.out.print("read jpg");
    }
}
