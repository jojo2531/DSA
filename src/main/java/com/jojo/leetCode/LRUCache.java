package com.jojo.leetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int cacheSize;

    public LRUCache(int cacheSize)   {
        super(cacheSize, 0.5f, true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > cacheSize;
    }
}
