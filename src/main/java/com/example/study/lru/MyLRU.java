package com.example.study.lru;

import com.google.gson.Gson;
import org.springframework.boot.json.GsonJsonParser;

import java.util.Hashtable;

public class MyLRU {

    private CacheMap<Integer, Integer> cacheMap;

    public MyLRU(int capacity){
        this.cacheMap = new CacheMap<>(capacity);
    }

    public int get(int key){
        if(cacheMap.containsKey(key)){
            int value = cacheMap.get(key);
            cacheMap.remove(key);
            set(key, value);
            return value;
        }
        return -1;
    }

    public void remove(int key){
        cacheMap.remove(key);
    }

    public void set(int key, int value){
        if(cacheMap.containsKey(key)){
            cacheMap.remove(key);
        }
        cacheMap.put(key, value);
    }

    public static void main(String[] args) {
        MyLRU myLRU = new MyLRU(5);
        myLRU.set(1, 1);
        myLRU.set(2, 2);
        myLRU.set(3, 3);
        myLRU.set(4, 4);
        myLRU.set(5, 5);
        System.out.println(new Gson().toJson(myLRU));
        myLRU.get(1);
        System.out.println(new Gson().toJson(myLRU));
        myLRU.set(6, 6);
        System.out.println(new Gson().toJson(myLRU));
        myLRU.set(3, 3);
        System.out.println(new Gson().toJson(myLRU));
    }
}
