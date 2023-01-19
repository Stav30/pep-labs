

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        int i ;
        // int[] nums = {1, 2, 3, 4, 5};
        // initialize a set
        Set<Integer> set = new HashSet<Integer>();
        for (i = 0 ; i < nums.length ; i++){ //{ System.out.println(nums[i]);}
            if (set.contains(nums[i])){ return true;}   
            // append each distinct element of array nums into a set
            else set.add(nums[i]);   
        }   
    
        return false;
    }
}
