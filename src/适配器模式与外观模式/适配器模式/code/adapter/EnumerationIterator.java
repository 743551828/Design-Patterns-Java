package 适配器模式与外观模式.适配器模式.code.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-17 13:15
 **/
public class EnumerationIterator<T> implements Iterator {

    Enumeration<T> enumeration;

    public EnumerationIterator(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
