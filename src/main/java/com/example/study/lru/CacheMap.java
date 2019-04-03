package com.example.study.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheMap<K, V> extends LinkedHashMap<K, V> {
    private int MAX;

    public CacheMap(Integer max){
        this.MAX = max;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX;
    }
}
