package javaDSA.hashing;
import java.util.*;

class Solution {
    public int romToInt(String s) {

    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	map.put('I',1);
    	map.put('V',5);
    	map.put('X',10);
    	map.put('L',50);
    	map.put('C',100);
    	map.put('D',500);
    	map.put('M',1000);

    	int i, l=s.length(), val=0, temp_val=map.get(s.charAt(0));
    	char ch;

    	for(i=0;i<l;i++)
    	{
    		ch = s.charAt(i);
    		if(map.get(ch) <= temp_val)
    			temp_val = map.get(ch);
    		else
    			val-=2*temp_val;
    		val += map.get(ch);
    		System.out.println(val);
    	}
    	return val;
	}
}

public class RomantoInteger
{
	public static void main(String[] args) 
	{
		Solution s = new Solution();
		System.out.println(s.romToInt("MCMXCIV"));
	}
}