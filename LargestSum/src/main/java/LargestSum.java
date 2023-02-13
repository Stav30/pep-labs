
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
       // Me: for, for , if , else if
       // nums is going to be an ArrayList
       int maxSum = -2147483648; int firstNum = 0; int secondNum = 0;
       for(int i = 0; i < nums.size(); i++){
        for ( int j = i+1 ; j < nums.size() ; j++ ) {
            int currentSum = nums.get(i) + nums.get(j);
            if ( currentSum > maxSum) {

            }
        }
       }
       
       
       
       
       
        // return 0;
    }
}