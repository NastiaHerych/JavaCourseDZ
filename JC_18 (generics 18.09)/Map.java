package com.company;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map <K,V> extends MyEntry<K,V>{
    private LinkedHashMap<K,V> map;

    public Map (K k, V v){
      super(k, v);
      this.map = new LinkedHashMap<K, V>();
      this.map.put(k,v);
    }

    public void add(K k, V v){
        map.put(k, v);
    }

    public void remove(K k){
        map.remove(k);
    }

    public void removeFromValue(K k) {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();
            if (next.getKey().equals(k)) {
                next.setValue((V) "null");
            }
        }
    }


    public void showSet() {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();
            System.out.println(next.getKey().toString());
        }
    }

    public void showList() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();
            System.out.println(next.getValue().toString());
        }
    }


    public void showMap() {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = (Entry<K, V>) iterator.next();
            System.out.println(next.getKey().toString() + " --> " + next.getValue().toString());
        }
    }
}
