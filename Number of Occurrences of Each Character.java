package mindstix.problems;
import java.util.*;

public class Solution {
    public List<Character> NumberofOccuranceofEachChar(String input){
        //lets consider string is in lower case
        input = input.toLowerCase();
        
        //Create on array to store the frequency of each charcater :)
        int[] FrequencyArray = new int[26];
        
        for (int i = 0; i < input.length(); i++){
            int ch = input.charAt(i);
            FrequencyArray[ch-97]++;   
        }
        
        List<Character> list = new ArrayList<>();
        //Calculating the size of output list
        int Size = 0;
        for (int i = 0; i < 26; i++) {
            if(FrequencyArray[i] > 0){
               Size++;
            }
        }
        for (int i = 0; i < Size; i++) {
           int Max = 0;
           int MaxIndex = 0;
            for (int j = 0; j < 26; j++) {
                if(FrequencyArray[j] > Max){
                    Max = FrequencyArray[j];
                    MaxIndex = j;
                }
            }
            char ch = (char)(MaxIndex+97);
            FrequencyArray[MaxIndex] = 0;
            list.add(ch); 
        } 
        return list;
      }
}
 