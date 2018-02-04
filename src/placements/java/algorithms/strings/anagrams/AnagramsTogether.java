package placements.java.algorithms.strings.anagrams;


import placements.java.algorithms.GenericUtil;
import placements.java.algorithms.strings.*;
public class AnagramsTogether {

	/*
	 *   naive method 1:
	 *   sort every word within the array(internal word sort)
	 *   maintain an index array which contains indexes of the individual words in the string
	 *   initially this index array will contain values 0,1...,n-1
	 *   sort the entire array and accordingly the indices within the index array will change
	 *   now print the words according to the order maintained by the index array
	 */
	
	public static void printAnagramsTogether(String []arr) {
		String temp[]=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=StringUtil.sortString(arr[i]);
		}
		Integer []index=new Integer[arr.length];
		for(int i=0;i<index.length;i++) {
			index[i]=i;
		}
		for(int i=0;i<temp.length-1;i++) {
			for(int j=temp.length-1;j>i;j--) {
				if(temp[j].compareTo(temp[j-1])<0) {
					GenericUtil.swap(temp,j,j-1);
					GenericUtil.swap(index, j, j-1);
				}
			}
		}
		
		for(int i=0;i<index.length;i++) {
			System.out.print(arr[index[i]]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		printAnagramsTogether(new String[] {"act","dag","get","cat","gad"});
	}
}
