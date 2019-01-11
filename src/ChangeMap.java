import java.util.*;

public class ChangeMap {
    public Map<String,String> changeMap(Map<String,String> map){
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
        map.clear();
        map.put("val1"," ");
        map.put("val2",temp);
        return map;
    }
}
