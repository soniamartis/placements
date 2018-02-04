package placements.java.algorithms;

public class GenericUtil {
	
	public static <T> void swap(T []arr,int i,int j) {
		T e = arr[i];
		arr[i]=arr[j];
		arr[j]=e;
	}


}
