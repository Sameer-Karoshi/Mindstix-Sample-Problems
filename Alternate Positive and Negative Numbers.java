package mindstix.problems;
import java.util.*;

public class Solution {
    //Rearrange the elements in array -,+,-,+ like this
    //This problem can easily solved by using 2 extra arrays using 0(n) space complexity 
    //But we have to solve it using O(1) Space only :)
    
    //Rotate array to the right 
    public void RotateArray(int nums[],int start, int end){
        int temp = nums[end];
        for(int i = end;i > start;i--){
           nums[i] = nums[i-1];
        }
        nums[start] = temp;
    }
    
    public void rearrange(int nums[], int n)
    {
        //wrong index is index at which wrong element is there !
        int wrongIndex = -1;
 
        for (int i = 0; i < n; i++)
        {
            if (wrongIndex >= 0)
            {
                if (((nums[i] >= 0)
                     && (nums[wrongIndex] < 0))
                    || ((nums[i] < 0)
                        && (nums[wrongIndex] >= 0))) {
                    
                    RotateArray(nums, wrongIndex, i);
                    if (i - wrongIndex >= 2)
                        wrongIndex = wrongIndex + 2;
                    else
                        wrongIndex = -1;
                }
            }
 
            if (wrongIndex == -1)
            {
                if (((nums[i] >= 0)
                     && ((i & 0x01) == 0))
                    || ((nums[i] < 0)
                        && (i & 0x01) == 1))
                    wrongIndex = i;
            }
        }

    }
}
 