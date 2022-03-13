package mindstix.problems;
import java.util.*;

public class Solution {
    public int KthSmallestElement(int nums[],int k){
        if(k == 0){
            return -1;
        }
        //Sort the array in ascending order :)
        Arrays.sort(nums);
        
        //I am using two pointer approach & using O(1) extra space with 0(n) Complexity :)
        int j = 0;
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        if(j != nums.length - 1){
            nums[j++] = nums[nums.length-1];
        }
        //Now we have array that does not contain duplicates(It contains but we shifted that elements to last)
        //Lets consider array of length j only
        if(k > j){
            return -1;
        }
        else{
            return nums[k-1];
        }
    }
}
 