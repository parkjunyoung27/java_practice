package algorithm;

public class InsertionSort {
	
	public static void insertionSort(int[] arr, int count) {
		
		int i = 0, j =0; // 0 부터 시작
		int temp = 0; //인덱스 값 
		
		for(i = 1; i < count; i++) { //두번째부터 시작 
			//1,2,3,4,5,6,7
			temp = arr[i]; //현재 값 
			j = i; //현재값 위치 
			while((j>0) && arr[j-1]>temp) { //j와 바로 앞 요소와 비교, 앞 요소가 더 큰 경우 
				arr[j] = arr[j-1]; //앞 요소 값으로 j 변경
				j = j-1; //j는 j-1씩 줄어듬  // 옮겨지면 바로 그 전과 비교
				//j가 사라면 
			}
			arr[j] = temp; // j는 j-1값 더 작은수로 변경 
			
			System.out.println("반복 -" + i);
			printSort(arr,count);
		}
		
	}
	
	public static void printSort(int value[], int count) {
		
		int i=0;
		for( i =0; i< count; i++) {
				System.out.println(value[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {80, 55, 70, 10, 60, 20, 40, 30};
		insertionSort(arr, 8);
	}

}
