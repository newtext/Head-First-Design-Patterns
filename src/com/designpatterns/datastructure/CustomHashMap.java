package com.designpatterns.datastructure;

public class CustomHashMap<K, V> {

    private Entry<K, V>[] table;
    private int size = 16;

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        public Entry(K key, V value, Entry<K, V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public CustomHashMap(){
        table = new Entry[size];
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % size;
    }

    public void display(){
        for(int i=0;i<size;i++){
            if(table[i] != null){
                Entry<K, V> entry = table[i];
                while(entry != null){
                    System.out.println("Key = "+entry.key + " and Value = " + entry.value + " hashcode = " + hash(entry.key));
                    entry=entry.next;
                }
            }
        }
    }

    public void put(K newKey, V newValue){
        int hash=hash(newKey);
        Entry<K, V> newEntry = new Entry<K,V> (newKey, newValue, null);
        if (table[hash] == null)  //Table's position of hashcode have no value then set the first entry
            table[hash] = newEntry;
        else {
            Entry<K, V> prev = null;
            Entry<K, V> current = table[hash];
            while (current != null ) { //Iterate until the end of the link list and set the next value as new input entry
                if (current.key.equals(newKey)) { //if key already exist replace the value
                    current.value = newValue;
                    return;
                }
                prev = current;
                current = current.next;
            }

            prev.next = newEntry;
        }
    }

    public boolean remove(K newKey){
        int hash=hash(newKey);
        if(table[hash] == null) //If hash of the key does not exist in table then key does not exist in table
            return false;
        else {
            /*
            Two pointers - prev and curr
            Iterate until you find the key/hash position and remove the key
             */
            Entry<K,V> prev = null;
            Entry<K,V> current = table[hash];
            while (current != null){
                if (current.key.equals(newKey)){
                    if (prev == null) { //If the key is in the first position of the list, then remove first entry
                        table[hash] = table[hash].next;
                        return true;
                    }
                    prev.next = current.next;
                    return true;
                }
                prev = current;
                current = current.next;
            }
        }
        return false;
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] != null) {
            Entry<K, V> temp = table[hash];
            while (temp != null){
                if (temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
        }
        return null;
    }

}
