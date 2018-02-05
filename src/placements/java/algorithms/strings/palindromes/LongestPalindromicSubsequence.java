package placements.java.algorithms.strings.palindromes;

import java.util.Scanner;

/*
 * program to find the longest palindromic subsequence
 *  TC:O(n^2)
 *  SC:O(n^2)
 *  references: 
 *  https://www.youtube.com/watch?v=_nCsPn7_OgI   (Tushar Roy)
 */
public class LongestPalindromicSubsequence {

	public static int getLongestPalindromicSubLength(String str) {
		int [][]a=new int[str.length()][str.length()];
		for(int i=0;i<str.length();i++) {
			a[i][i]=1;
		}
		for(int l=2;l<=str.length();l++) {
			for(int i=0;i<=str.length()-l;i++) {
				int j=i+l-1;
				if(str.charAt(i)==str.charAt(j)) {
					a[i][j]=a[i+1][j-1]+2;
				}
				else {
					a[i][j]=Math.max(a[i][j-1], a[i+1][j]);
				}
			}
		}
		printLongestSubsequence(a, str, a[0][str.length()-1]);
		return a[0][str.length()-1];
	}
	
	public static void printLongestSubsequence(int [][]a,String str,int lps) {
		int i=0,j=str.length()-1;
		int m=0,n=lps-1;
		char []ch=new char[lps];
		while(i<=j) {
			if(str.charAt(i)==str.charAt(j)) {
				ch[m++]=str.charAt(i++);
				ch[n--]=str.charAt(j--);
			}
			else {
				if(a[i][j-1]>=a[i+1][j]) {
					j--;
				}
				else {
					i++;
				}
			}
		}
		String palin=new String(ch);
		System.out.println(palin);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			String str=sc.next();
			System.out.println(getLongestPalindromicSubLength(str));
		}
	}
}
