package placements.java.algorithms.strings.anagrams;

public class AnagramUtil {

	public static boolean areAnagrams(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int count[] = new int[26];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)-'a']++;
		}
		for(int i=0;i<str2.length();i++) {
			count[str2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
        return true;
	}
	
	public static void main(String[] args) {
		String str1="sonia";
		String str2= "ainos";
		
		System.out.println(areAnagrams(str1, str2));
	}
}
