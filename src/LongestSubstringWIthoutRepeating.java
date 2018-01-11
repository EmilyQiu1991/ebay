import java.util.*;

/**
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 */
public class LongestSubstringWIthoutRepeating {

	public static void main(String[] args) {

	}
    public int lengthOfLongestSubstring(String s) {
    	// mapping from char to index in current substring [i, j ]
    	  Map<Character,Integer> map = new HashMap<>();
          //maintain a substring window [i,j]
          int i  =0 , j = 0 ;
          int res = Integer.MIN_VALUE;
          for(j = 0 ; j <s.length();j++) {
          	char c = s.charAt(j);
          	// if map contains c but the index is out of the window, still valid
          	if(!map.containsKey(c) || map.get(c)<i) {
          		map.put(c, j);
          		res = Math.max(j-i+1, res);
          		continue;
          	}
          	i = map.get(c)+1;
          	res = Math.max(j-i+1, res);
          	map.put(c, j);
          	
          }
          return res  == Integer.MIN_VALUE? 0: res;
    }
	
}
