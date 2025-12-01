package com.nhsoft.neptune.api.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 兽人王
 * @description:
 * @Date: 2025/11/10 19:22
 */
public class CollectionUtil {


    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> T getFirst(Iterable<T> iterable) {
        if (iterable instanceof List) {
            final List<T> list = (List<T>) iterable;
            return CollectionUtil.isEmpty(list) ? null: list.get(0);
        }

        return getFirst(getIter(iterable));
    }

    public static <T> T getLast(Collection<T> collection) {
        return get(collection, -1);
    }

    public static <T> T get(Collection<T> collection, int index) {
        if (null == collection) {
            return null;
        }

        final int size = collection.size();
        if (0 == size) {
            return null;
        }

        if (index < 0) {
            index += size;
        }

        // 检查越界
        if (index >= size || index < 0) {
            return null;
        }

        if (collection instanceof List) {
            final List<T> list = ((List<T>) collection);
            return list.get(index);
        } else {
            return get(collection.iterator(), index);
        }
    }



    public static <T> T getFirst(Iterator<T> iterator) {
        return get(iterator, 0);
    }

    public static <E> E get(final Iterator<E> iterator, int index) throws IndexOutOfBoundsException {
        if(null == iterator){
            return null;
        }
        Asserts.isTrue(index >= 0, ()-> new IllegalArgumentException("[index] must be >= 0"));
        while (iterator.hasNext()) {
            index--;
            if (-1 == index) {
                return iterator.next();
            }
            iterator.next();
        }
        return null;
    }

    public static <T> Iterator<T> getIter(Iterable<T> iterable) {
        return null == iterable ? null : iterable.iterator();
    }
}
