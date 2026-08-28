import java.util.*;
 class UniqueNumberOfOccurences {
         public boolean uniqueOccurrences ( int[] arr){
             Map<Integer, Integer> map = new HashMap<>();

             for (int num : arr) {
                 map.put(num, map.getOrDefault(num, 0) + 1);
             }

             Set<Integer> set = new HashSet<>();

             for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                 if (!set.contains(entry.getValue())) {
                     set.add(entry.getValue());
                 } else {
                     return false;
                 }
             }

             return true;

         }
         public static void main(String[]args){
             UniqueNumberOfOccurences obj = new UniqueNumberOfOccurences();
             int[]arr = {1,2,2,1,1,3};
             boolean result = obj.uniqueOccurrences(arr);
             System.out.println("Result: " + result);
     }
 }

