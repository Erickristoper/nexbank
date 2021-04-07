package com.nextbank.exam;

import java.util.HashSet;
import java.util.Set;

public class SimpleMap implements Map{

    private static class KeyValue {
        String key;
        Object value;

        KeyValue(String key , Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "KeyValue{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    private final Set<KeyValue> keysValues = new HashSet<>();

    @Override
    public void put(String key, Object value) {
        if (isUniqueNotNull(key)) keysValues.add(new KeyValue(key, value));
    }

    private boolean isUniqueNotNull(String key) {
        if (key == null || key.equals("") ) {
            System.out.println("NULL OR EMPTY NOT ALLOWED!");
            return false;
        }

        return keysValues.stream()
                .filter(kv -> kv.key.equals(key))
                .peek(k -> System.out.println("DUPLICATE KEY: " + key + " FOUND!"))
                .count() == 0;
    }

    @Override
    public Object get(String key) {

        return (Object) keysValues.stream()
                .filter(kv -> kv.key.equals(key))
                .map(kv -> kv.value)
                .findFirst().orElse(null);
    }

    @Override
    public void printMap(){
        keysValues.forEach(kv -> System.out.println(kv.toString()));
    }
}

