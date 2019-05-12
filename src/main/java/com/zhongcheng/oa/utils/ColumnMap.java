package com.zhongcheng.oa.utils;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ColumnMap extends HashMap<String, Object>
        implements Map<String, Object> {

    private ColumnMap instance;

    public ColumnMap() {
        instance = this;
    }

    public static  ColumnMap build() {
        return new ColumnMap();
    }

    public ColumnMap putVal(String key, Object val) {
        instance.put(key, val);
        return this;
    }

    @Test
    public void t1() {
        ColumnMap objectObjectColumnMap = ColumnMap.build().putVal("", "").putVal("", "");

    }

}
