package 工厂模式.工厂方法模式.code.factory;

import 工厂模式.工厂方法模式.code.reader.Reader;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-12 13:46
 **/
public interface Factory {

    Reader getReader();

}
