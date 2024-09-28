package org.gfg.collection;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        KeyAnalyzer analyzer = new HashMapKeyAnalyzerImpl();
        analyzer.storeKey("pen");
        analyzer.storeKey("pencil");
        analyzer.storeKey("pen");
        analyzer.storeKey("laptop");
        analyzer.storeKey("charger");
        analyzer.storeKey("charger");
        analyzer.storeKey("mobile");
        analyzer.storeKey("table");
        analyzer.storeKey("chair");
        analyzer.storeKey("pillow");
        analyzer.storeKey("bedsheet");
        analyzer.storeKey("ac");
        analyzer.storeKey("paper");
        analyzer.storeKey("pen");
        analyzer.storeKey("paper");
//        System.out.println(analyzer.fetchKeys());
        System.out.println(analyzer.fetchKeysWithCount());
        System.out.println(analyzer.getTop5());
    }
}
// u need to some method to store the values
// u need a method to return the data back to pm
// standarizaton

// array -> new int[] {1,2,3} -> sop array -> what is output

// do some changes, get the sorted element in desc  by using treeset
// do something with treemap, u have to return keys in desc order
// return top n element
// u have to return top 5 records (All record) 1 => all elements Map<Integer, List<String>)