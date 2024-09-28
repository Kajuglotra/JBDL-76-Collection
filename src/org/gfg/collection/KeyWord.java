package org.gfg.collection;

public class KeyWord implements Comparable<KeyWord>{

    private String key;
    private int count;

    public KeyWord(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "KeyWord{" +
                "key='" + key + '\'' +
                ", count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(KeyWord o) {
       if(o.getCount() > this.getCount()){
           return 1;
       }
       return -1;
    }
}
