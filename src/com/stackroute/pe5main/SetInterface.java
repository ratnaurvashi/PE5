package com.stackroute.pe5main;
import java.util.*;

public class SetInterface {
    //method for converting sortedset to list
    public List<String> convertSortedSet(Set<String> sortedset){
        //check for null
        if(sortedset==null)
            return null;
      List<String> list = new ArrayList<>();
      //adds all elements of set to list
        list.addAll(sortedset);
        return list;
    }

    //method for sorting names
    public Set<String> sortNames(String[] names){
        //check for null
        if(names==null)
            return null;
        Set<String> sortedset = new HashSet<>();
        for(int i=0;i<names.length;i++)
            sortedset.add(names[i]);
        return sortedset;
    }
}
