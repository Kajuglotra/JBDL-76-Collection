package org.gfg.collection;

import com.sun.source.tree.Tree;

import java.util.*;

public class SetKeyAnalyzerImpl implements KeyAnalyzer{

    public Set<String> keySet;

    public SetKeyAnalyzerImpl(){
//        keySet = new HashSet<>();
//        keySet = new LinkedHashSet<>();
        keySet = new TreeSet<>();
    }

    @Override
    public void storeKey(String key) {
        keySet.add(key);
    }

    @Override
    public List<String> fetchKeys() {
        return List.copyOf(keySet);
    }
}
