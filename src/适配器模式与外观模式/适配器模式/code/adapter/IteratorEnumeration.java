package 适配器模式与外观模式.适配器模式.code.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:20
 **/
public class IteratorEnumeration<T> implements Enumeration {

    Iterator<T> iterator;

    public IteratorEnumeration(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
