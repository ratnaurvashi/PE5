/*2. Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {
    public Map<String,Integer> numberOfCounts(String str){
        Map<String,Integer> map = new HashMap<>();
        String[] nums = {"one","two","three"};
        for(int i=0;i<nums.length;i++) {
            Matcher matcher = Pattern.compile(nums[i]).matcher(str);
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            map.put(nums[i],counter);
        }
        return map;
    }
}
