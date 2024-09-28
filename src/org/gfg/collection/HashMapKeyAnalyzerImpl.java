package org.gfg.collection;

import java.security.Key;
import java.util.*;

public class HashMapKeyAnalyzerImpl implements KeyAnalyzer{
    private Map<String, KeyWord> keyWithCount;
    private Queue<KeyWord> queue;


    public HashMapKeyAnalyzerImpl(){
//        keyWithCount = new HashMap<>();
//        keyWithCount = new LinkedHashMap<>();
        keyWithCount = new TreeMap<>();
        queue = new PriorityQueue<>();
    }
    @Override
    public void storeKey(String key) {
        if(keyWithCount.containsKey(key)){
            KeyWord keyWord = keyWithCount.get(key);
            queue.remove(keyWord);
            KeyWord newKeyWord =new KeyWord(key,keyWord.getCount()+1);
            keyWithCount.put(key, newKeyWord);
            queue.add(newKeyWord);
        }else{
            KeyWord keyWord = new KeyWord(key, 1);
            queue.add(keyWord);
            keyWithCount.put(key, keyWord);
        }
    }

    @Override
    public List<String> fetchKeys() {
        return null;
    }

    @Override
    public Map<String, Integer> fetchKeysWithCount(){
        Map<String, Integer> resultMap = new HashMap<>();
        for(Map.Entry<String, KeyWord> entry: keyWithCount.entrySet()){
            resultMap.put(entry.getKey(), entry.getValue().getCount());
        }
        return resultMap;
    }
    @Override
    public List<KeyWord> getTop5(){
        List<KeyWord> result = new ArrayList<>();
        for(int i=0;i<5;i++){
            result.add(queue.poll());
        }
        return result;
    }


}
// comparator
// comparable