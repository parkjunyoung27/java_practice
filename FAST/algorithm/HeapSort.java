package algorithm;

public class HeapSort {

	private int SIZE; //배열 길이 
	private int heapArr[]; //배열
	
	public HeapSort() //배열 생성
	{
		SIZE=0;
		heapArr = new int [50];
	}
	
	public void insertHeap(int input) //heap 숫자 넣기
	{
		int i = ++SIZE;
		//while((i != 1) && (input > heapArr[i/2])){ //max heap
		while(( i != 1) && ( input < heapArr[i/2])) {//min heap 
			//i가 1개가 아니라면 i의 중간인덱스보다 작다면 
			heapArr[i] = heapArr[i/2]; //루트 인덱스와 교체 
			i = i/2;
		}
		heapArr[i] = input;
	}
	
	public int getHeapSIze() {
		return SIZE;
	}
	
	public int deleteHeap() {
		
		int parent, child; //부모값, 자식값
		int data, temp; 
		data = heapArr[1]; //루트값 // 첫번째 값 비워놨기 때문에 1부터시작
		temp = heapArr[SIZE]; // 마지막 값
		SIZE -= 1;
		parent = 1; child = 2;
		
		while(child <= SIZE) {
			//if((child < HEAP_SIZE) && (heapArr[child] < heapArr[child+1])) {//max heap
			if((child < SIZE) && (heapArr[child] > heapArr[child+1])) {//min heap //child가  child+1보다 크다면
				child++; //  child 위치 +1
			}
			//if(temp >= heapArr[child]) break; //max heap
			if(temp <= heapArr[child]) break; //min heap  자식값이 마지막값보다 크거나 같다면 
			heapArr[parent] = heapArr[child]; // child값이 부모값으로 
			parent = child; //부모 위치는 = 자식위치
			child *= 2; // 자식위치 *2
			
		}
		
		heapArr[parent] = temp;
		return data;
	}
	
	
	public void printHeap() {
		//System.out.printf("\n Max Heap : ");
		System.out.printf("\n Min Heap : ");
		for (int i = 1; i < SIZE; i++) {
			System.out.printf("[%d] ", heapArr[i]);
		}
	}
	
	public static void main(String[] args) {
		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		
		h.printHeap();
		
		int n, data;
		n = h.getHeapSIze();
		for(int i = 1; i < n; i++) {
			data = h.deleteHeap();
			System.out.printf("\n 출력 : [%d]", data);
		}
	}	
}












