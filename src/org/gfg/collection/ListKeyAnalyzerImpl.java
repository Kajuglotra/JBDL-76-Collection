package org.gfg.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListKeyAnalyzerImpl implements KeyAnalyzer{
    private List<String> keys;// early

    public ListKeyAnalyzerImpl(){
//        keys = new ArrayList<>(); // lazy
//        keys = new LinkedList<>();
        keys = new Vector<>();
    }
    @Override
    public void storeKey(String key) {
        keys.add(key);
    }

    @Override
    public List<String> fetchKeys() {
       return keys;
    }
}
