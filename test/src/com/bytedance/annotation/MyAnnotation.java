package com.bytedance.annotation;

import java.lang.annotation.*;

/**
 * @author doubleBear
 * @create 2020 06 11 18:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {

    int value();

    String type();

    MyElementType[] element();

}


