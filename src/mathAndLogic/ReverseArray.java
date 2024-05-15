package mathAndLogic;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		for(int i=0;i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
// swap the elements till - array.length/2 not the whole array
// as it may cause overwriting the elements.