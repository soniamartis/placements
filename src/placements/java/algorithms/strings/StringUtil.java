package placements.java.algorithms.strings;

import java.util.Arrays;

public class StringUtil {
	
	/*
	 * utility function to sort a string
	 */
	public static String sortString(String str) {
		char []ch=str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
		
	}
	
	
}
