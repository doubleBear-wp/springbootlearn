package com.bytedance.annotation;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * @author doubleBear
 * @create 2020 06 11 20:17
 */
public @interface Anno2 {
    //Anno2这个注解有一个属性，这个属性被Anno注解修饰
    @Anno()
    String value();

}
