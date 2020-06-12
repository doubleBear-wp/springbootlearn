package com.bytedance.annotation;

import java.lang.annotation.*;

/**
 * @author doubleBear
 * @create 2020 06 11 19:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MyAnnotations {
    MyAnnotation[] value();
}
