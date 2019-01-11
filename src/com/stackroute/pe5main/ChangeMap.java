package com.stackroute.pe5main;

import java.util.*;

public class ChangeMap {
    public Map<String,String> changeMap(Map<String,String> map){
        //check for null
        if(map==null)
            return null;
        //iterator for map
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        String temp="";
        while(itr.hasNext()){
            itr.next();
            Map.Entry<String, String> entry = itr.next();
            if(entry.getValue()!="" && entry.getValue()!=null && entry.getValue()!=" "){
                temp = entry.getValue();
            }
            else
                return map;
        }
        //removing all elements from map
        map.clear();
        map.put("val1"," ");
        map.put("val2",temp);
        return map;
    }
}
