package org.gfg.collection;

import java.util.List;

public interface KeyAnalyzer {
    void storeKey(String key);

    List<String> fetchKeys();
}
// pen, pencil, laptop, charger

// list -> pen, pencil, laptop, charger