package mindstix.problems;
import java.util.Arrays;
public class Solution {
    public void findDuplicates(int[] array,int n){
        //if there is no element in array then no duplicates also !
        if(array.length == 0){
            System.out.println("Array is empty, so no duplicates are there :)");
        }
        //here array conatins element from 0 to n-1 and it may contain duplicates or not also.
        //We can solve this problem by using Map in java but we need to solve using constant space only !
        //So lets create hashmap manually in array only :)
        
        for (int i = 0; i < array.length; i++) {
           array[array[i]%array.length] = array[array[i]%array.length] + array.length;
        }
        System.out.println("The Duplicate Elements In Array: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 2*array.length){
                System.out.print(i + " ");
            }
        }
      }
}