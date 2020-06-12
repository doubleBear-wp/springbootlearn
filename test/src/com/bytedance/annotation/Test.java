package com.bytedance.annotation;

import java.lang.annotation.Annotation;

/**
 * @author doubleBear
 * @create 2020 06 11 19:19
 */
public class Test {
    public static void main(String[] args) {
//        Class<Demo2> clazz = Demo2.class;
        Class<Demo> clazz1 = Demo.class;
        Annotation[] annotations = clazz1.getAnnotations();
        for (Annotation annotation : annotations) {
            MyAnnotation a = (MyAnnotation)annotation;
            System.out.println(a.type());
            System.out.println(a.element());
            System.out.println(a.value());
        }

        //注解类型也是Class的实例
        /*Class<Anno> annoClass = Anno.class;
        Annotation[] annotations = annoClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }*/


    }
}
