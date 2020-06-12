package com.bytedance.annotation;

/**
 * @author doubleBear
 * @create 2020 06 11 19:11
 */
public enum MyElementType {
    RESOURCE(1),
    CLASS(2),
    RUNTIME(3);
    private final int i;

    private MyElementType(int i){
        this.i = i;
    }
}
