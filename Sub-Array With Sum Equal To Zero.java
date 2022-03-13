package mindstix.problems;
public class Solution {
    public boolean ZeroSum(int[] array){
        boolean result = false;
        //created two loops one for staring index of subarrray and another for ending index
        //and if sum == 0 it will break and return result
        for (int i = 0; i < array.length; i++) {
           int sum = 0;
           for(int j = i;j < array.length;j++){
               sum = sum + array[j];
               if(sum == 0){
                   result = true;
                   break;
               }
           } 
           if(result){
               break;
           }
        }
        return result;
      }
}
