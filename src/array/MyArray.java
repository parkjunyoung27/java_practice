package array;

import java.util.Arrays;

//Array의 특징 
//동일한 데이터 타입을 순서에 따라 관리하는 자료구조 

public class MyArray {
	int[] intArr; //int array 처음에 타입잡고 시작 
	int count; // element의 개수
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10; //배열크기
		intArr = new int[ARRAY_SIZE]; //배열사이즈 최대인덱스 9
	} 
	 
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) { // 요소가 들어가면 
		
		if(count >= ARRAY_SIZE) {//인덱스가 배열사이즈보다 같거나 크면 오류 
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num; //count가 처음에는 인덱스 0을 가리킴
		// 요소를 하나씩 추가 처음에는 0에 대입, 그리고 1에 대입
	}
	
	public void insertElement(int position, int num) { // 위치 인덱스 , 대입 숫자 
		//어디에 넣을건지
		int i; //인덱스 나타내기위해 
		
		if(position < 0 || position > count) { 
			//인덱스가 0보다 작거나 count(최대 인덱스)보다 클때 
			return;
		}
		if(count >= ARRAY_SIZE) { 
			//addElement에서 count++ 되어있음
			//최대 인덱스가 ARRAY_SIZE와 같을 때 
			return;
		}
		
		//한칸씩 뒤로 밀기 
		for(i = count-1; i>=position; i--) { 
			intArr[i+1] = intArr[i]; // 한칸씩 뒤로가게됨 
		}
		intArr[position] = num;
		count++; // 요소 갯수가 하나 늘어낳기 때문에 추가 
	}
	
	public int removeElement(int position) {//뒤에있는게 앞으로 와야됨 
		
		int ret = ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("Array is empty");
			return ret;
		}
		if(position<0 || position > count-1) {//인덱스보다 크거나 인덱스 0보다 작을때 오류
			
			return ret;
			
		}
		
		ret = intArr[position];//인덱스 위치 값
		for(int i = position; i<count-1; i++) {
			intArr[i] = intArr[i+1]; //뒤에서 앞으로
		}
		count--;
		
		return ret;
		
	}
	
	public int getSize()
	{
		return count; // 요소갯수 반환
	}

	
	public boolean isEmpty() //요소 있는지 없는지 확인
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position) // 인덱스 위치 요소값 반환
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll() // 요소 전부 출력
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll() //요소 전부 제거, 0으로 만듬
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
