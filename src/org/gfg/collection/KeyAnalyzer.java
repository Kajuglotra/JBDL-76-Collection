package org.gfg.collection;

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {
    void storeKey(String key);

    List<String> fetchKeys();

    default Map<String, Integer> fetchKeysWithCount(){
        return null;
    }

    default List<KeyWord> getTop5(){
        return null;
    }
}
// pen, pencil, laptop, charger

// list -> pen, pencil, laptop, charger