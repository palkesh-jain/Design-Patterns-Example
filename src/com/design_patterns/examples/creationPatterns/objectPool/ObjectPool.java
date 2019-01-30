package com.design_patterns.examples.creationPatterns.objectPool;

import java.util.HashMap;
import java.util.Map;

class ObjectPool {

    private static long expTime = 10000; // 10 seconds
    private static HashMap<Person, Long> available = new HashMap<Person, Long>();
    private static HashMap<Person, Long> inUse = new HashMap<Person, Long>();

    synchronized static Person getObject() {
        long now = System.currentTimeMillis();
        if (!available.isEmpty()) {
            for (Map.Entry<Person, Long> entry : available.entrySet()) {
                if (now - entry.getValue() > expTime) { //object has expired
                    popElement(available);
                } else {
                    Person po = popElement(available, entry.getKey());
                    push(inUse, po, now);
                    return po;
                }
            }
        }

        // either no Person is available or each has expired, so return a new one
        return createPerson(now);
    }

    private synchronized static Person createPerson(long now) {
        Person po = new Person();
        push(inUse, po, now);
        return po;
    }

    private synchronized static void push(HashMap<Person, Long> map,
                                          Person po, long now) {
        map.put(po, now);
    }

    static void releaseObject(Person po) {
        cleanUp(po);
        available.put(po, System.currentTimeMillis());
        inUse.remove(po);
    }

    private static void popElement(HashMap<Person, Long> map) {
        Map.Entry<Person, Long> entry = map.entrySet().iterator().next();
        map.remove(entry.getKey());
    }

    private static Person popElement(HashMap<Person, Long> map, Person key) {
        map.remove(key);
        return key;
    }

    private static void cleanUp(Person person) {
        person.setName(null);
        person.setCity(null);
        person.setLanguage(null);
    }
}
    