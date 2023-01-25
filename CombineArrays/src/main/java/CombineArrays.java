import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

         // length of firstArray
         int a1 = arr1.length;
        
         // length of secondArray
         int b1 = arr2.length;
         
         // combined array size
         int c1 = a1 + b1;
   
         // create the combined array
         int[] c = new int[c1];
   
         // use java built-in function arraycopy
         System.arraycopy(arr1, 0, c, 0, a1);
         System.arraycopy(arr2, 0, c, a1, b1);
        
         return c;
       
        //return null;
    }
}
