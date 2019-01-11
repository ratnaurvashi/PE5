/*6. Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive
*/

import java.util.*;

public class SetInterface {
    public List<String> convertSortedSet(Set<String> sortedset){
      List<String> list = new ArrayList<>();
        list.addAll(sortedset);
        return list;
    }

    public Set<String> sortNames(String[] names){
        Set<String> sortedset = new HashSet<>();
        for(int i=0;i<names.length;i++)
            sortedset.add(names[i]);
        return sortedset;
    }
}
