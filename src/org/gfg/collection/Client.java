package org.gfg.collection;

public class Client {
    public static void main(String[] args) {
        KeyAnalyzer analyzer = new ListKeyAnalyzerImpl();
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
        System.out.println(analyzer.fetchKeys());
    }
}
// u need to some method to store the values
// u need a method to return the data back to pm
// standarizaton

// array -> new int[] {1,2,3} -> sop array -> what is output