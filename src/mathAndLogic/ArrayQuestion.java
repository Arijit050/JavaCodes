package mathAndLogic;



public class ArrayQuestion {

	public static void main(String[] args) {
	int[] arr = {5,4,3,2,10,11};
	int res = arrayChallange(arr);
	System.out.println(res);
	}
	public static int arrayChallange(int[] arr) {
		if(arr.length<3) {
			return -1;
		}
		int checkInDes=0;
		int index = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				checkInDes++;
				if(checkInDes==1) {
					return index;
				}
				checkInDes=0;
			}else if(arr[i]<arr[i-1]) {
				if(checkInDes==0) {
					return index;
				}
				checkInDes=1;
			}else {
				continue;
			}
			index = i;
		}
		return -1;
	}

}
