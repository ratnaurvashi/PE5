package com.stackroute.pe5main;

import java.util.ArrayList;

public class ReplaceElement {
    //method for replacing elements in element arraylist by replacing the elements in replace array by elements in replacement array
    public ArrayList<String> replaceElement(ArrayList<String> elements, String[] replace, String[] replacement){
        //checking for null
        if(elements==null)
            return null;
        //creating new arraylist for storing modified elements after replacing
        ArrayList<String> newlist = new ArrayList<>();
        //finding the elements to be replaced and adding their replacement in newlist
        for(int i=0;i<elements.size();i++){
            int flag=0;
            for(int j=0;j<replace.length;j++) {
                if (elements.get(i).equals(replace[j])) {
                    newlist.add(elements.get(i).replace(replace[j], replacement[j]));
                    flag = 1;
                }
            }
            //if we were not able to find the element in replace array, put it as it is in newlist
            if(flag==0)
                newlist.add(elements.get(i));
            }
        return newlist;
    }

    //method for clearing/emptying the list
    public ArrayList<String> removeAllElements(ArrayList<String> elements){
        //checking for null case
        if(elements==null)
            return null;
        //removing all the elements
        elements.clear();
        return elements;
    }
}
