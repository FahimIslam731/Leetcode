import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

class Solution{
    /**
     * Finds two indices in the nums array for 
     * 
     * @param nums Input integer array.
     * @param target Input target value.
     * @return An array with the two indexes in nums that sum to target.
     */
    public static int[] twoSum(int[] nums, int target) {
        int [] soln = {-1, -1};
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){     
                if(nums[i] + nums[j] == target){
                    soln[0] = i;
                    soln[1] = j;    
                    return soln;
                }
            }
        }
        
        return soln;
    }



    /**
     * Main mathod, starts
     * 
     * @param args Input arguments, unused in this program.
     */
    public static void main(String[] args){
        System.out.print("Test 1: ");
        test1();
        System.out.print("Test 2: ");
        test2();
        System.out.print("Test 3: ");
        test3();
    }
 
    /**
     * Test #1: 
     * Array: {2, 7, 11, 15}
     * Target: 9
     * Expected Result: {0, 1}
     */
    @Test
    public static void test1() {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        assertEquals(Arrays.toString(twoSum(arr, target)), Arrays.toString(new int[]{0, 1}));
        System.out.println("Test Passed.");
    }

    /**
     * Test #2: 
     * Array: {3, 2, 4}
     * Target: 6
     * Expected Result: {1, 2}
     */
    @Test
    public static void test2() {
        int[] arr = new int[]{3, 2, 4};
        int target = 6;
        assertEquals(Arrays.toString(twoSum(arr, target)), Arrays.toString(new int[]{1, 2}));
        System.out.println("Test Passed.");
    }

    /**
     * Test #3: 
     * Array: {3, 3}
     * Target: 6
     * Expected Result: {0, 1}
     */
    @Test
    public static void test3() {
        int[] arr = new int[]{3, 3};
        int target = 6;
        assertEquals(Arrays.toString(twoSum(arr, target)), Arrays.toString(new int[]{0, 1}));
        System.out.println("Test Passed.");
    }
}

