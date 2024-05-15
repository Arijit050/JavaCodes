package mathAndLogic;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] number = {23,34,5,21,54,65};
		System.out.println("Before "+Arrays.toString(number));
	
		bubbleSort(number);
		System.out.println("After"+ Arrays.toString(number));
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
