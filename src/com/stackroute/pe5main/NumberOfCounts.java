package com.stackroute.pe5main;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {
    //method for counting number of times, elements of number array occurred in sentence string
    public Map<String,Integer> numberOfCounts(String sentence){
        //checking for null case
        if(sentence==null)
            return null;
        //creating new map for adding the elements of number array and their counts
        Map<String,Integer> map = new HashMap<>();
        String[] number = {"one","two","three"};
        for(int i=0;i<number.length;i++) {
            //matcher will match the sentence string with the pattern that is provided in number array
            Matcher matcher = Pattern.compile(number[i]).matcher(sentence);
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            map.put(number[i],counter);
        }
        return map;
    }
}
