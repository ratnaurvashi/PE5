/*3. Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
*/

import java.util.HashMap;
import java.util.Map;

public class StringAppearance {

    public Map<String,Boolean> stringAppearance(String[] arr){
        Map<String,Integer> map = new HashMap();
        Map<String,Boolean> mapbool = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
                mapbool.put(arr[i],true);
            }
            else {
                map.put(arr[i], 1);
                mapbool.put(arr[i],false);
            }
        }
        return mapbool;
    }
}
