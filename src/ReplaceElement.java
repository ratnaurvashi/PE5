/*1. Write a Java program to update specific array element by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []
*/

import java.util.ArrayList;

public class ReplaceElement {
    public ArrayList<String> replaceElement(ArrayList<String> elements, String[] replace, String[] replacement){
        ArrayList<String> newlist = new ArrayList<>();

        for(int i=0;i<elements.size();i++){
            int flag=0;
            for(int j=0;j<replace.length;j++) {
                if (elements.get(i).equals(replace[j])) {
                    newlist.add(elements.get(i).replace(replace[j], replacement[j]));
                    flag = 1;
                }
            }
            if(flag==0)
                newlist.add(elements.get(i));
            }

        return newlist;
    }

    public ArrayList<String> removeAllElements(ArrayList<String> elements){
        elements.clear();
        return elements;
    }
}
