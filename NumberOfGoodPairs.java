import java.util.*;
public class NumberOfGoodPairs {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            return count;
        }
        public static void main(String[]args){
            NumberOfGoodPairs obj = new NumberOfGoodPairs();
            int[]nums={1,2,3,1,1,3};
            int result=obj.numIdenticalPairs(nums);
            System.out.println("Result: " + result);
    }
}
