package com.bytedance.annotation;

/**
 * @author doubleBear
 * @create 2020 06 11 18:47
 */
@SuppressWarnings({})
@MyAnnotation(value = 1,type = "a",element = {MyElementType.CLASS})
//@MyAnnotation(value = 2,type = "b",element = {MyElementType.CLASS})
public class Demo {
}

class Demo2 extends Demo{

}
