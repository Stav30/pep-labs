
public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        int [] absNums = new int[nums.length] ;
        
        for (int i = 0; i < nums.length ; i++ ) {
            absNums[i] = Math.abs(nums[i]);
        }
      return absNums; 
    }
    
}

/** 
 * produce an array of abs values 
 
import java.io.*;
import java.util.Arrays;

public class ArrayAbsoluteValue {
    public static void main(String [] args) {
        int[] nums = {1, -3, 5, -6};
        int [] absNums = new int[nums.length] ;
        //absNums = nums.abs();
        //System.out.println(Math.abs(-5));
        //Math.abs(nums);
        //nums.abs();
        for (int i = 0; i < nums.length  ; i++ ) {
            System.out.println(Math.abs(nums[i]));
            absNums[i] = Math.abs(nums[i]); 
    }
    System.out.println(Arrays.toString(absNums));
    System.out.println("--------");
}
}

// System.out.println(Arrays.toString(mfs)); //print array


*/