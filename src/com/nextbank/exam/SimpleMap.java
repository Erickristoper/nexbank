package com.nextbank.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleMap implements Map{

    private class KeyValue {
        String key;
        Object value;

        KeyValue(String key , Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private Set<KeyValue> keysValues = new HashSet<>();

    @Override
    public void put(String key, Object value) {
       keysValues.add(new KeyValue(key, value));
    }

    @Override
    public Object get(String key) {
       Iterator<KeyValue> iterator = keysValues.iterator();
       while (iterator.hasNext()) {
           KeyValue kv = iterator.next();
           if (kv.key.equals(key)) return kv.value;
       }
       return null;
    }
}

