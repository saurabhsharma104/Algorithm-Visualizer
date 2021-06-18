package sortingalgo;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int arr[] = {5,7,12,6,3,12,6,18,8,6,2,6,12,15,8,19,13,11};
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selectionSort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	

	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++) {
			int key = i;
			for(int  j = i+1;j<arr.length;j++) {
				if(arr[key] > arr[j]) 
					key = j;
			}
			int t = arr[i];
			arr[i] = arr[key];
			arr[key] = t;
		}
		
	}

}
