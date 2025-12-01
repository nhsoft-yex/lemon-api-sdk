package com.nhsoft.neptune.api.internal.util;

import java.util.function.Supplier;

/**
 * @auther nhsoft.yex
 */
public class Asserts {

    public static <X extends Throwable> void isTrue(boolean expression, Supplier<X> exceptionSupplier) throws X {
        if (!expression) {
            throw exceptionSupplier.get();
        }
    }

    public static <X extends Throwable> void notNull(Object object, Supplier<X> exceptionSupplier) throws X {
        if (object == null) {
            throw exceptionSupplier.get();
        }
    }
}
