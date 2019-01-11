package com.stackroute.pe5main;
import java.util.HashMap;
import java.util.Map;

public class StringAppearance {
    //method for finding the appearance of string in a string array
    public Map<String,Boolean> stringAppearance(String[] words){
        //checking for null value
        if(words==null)
            return null;
        //map in which counts will be stored
        Map<String,Integer> map = new HashMap();
        //map in which the boolean values will be stored based on count condition
        Map<String,Boolean> booleanmap = new HashMap();
        //counting the number of times the words have occurred in the array
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i]+1));
                //if count is more than and equal to 2 then true
                booleanmap.put(words[i],true);
            }
            else {
                map.put(words[i], 1);
                //if count is less than 2 then false
                booleanmap.put(words[i],false);
            }
        }
        return booleanmap;
    }
}
