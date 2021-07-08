package algorithm;

// 최대 최소값 구하기
public class MinMaxProblem {
	
	public static void main(String[] args) {
		
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		// 첫번쨰 값을 최대최소로 먼저 지정
		int min = numbers[0];
		int max = numbers[0];
		
		//인덱스 위치
		int minPos = 0; 
		int maxPos = 0;
		
		for(int i = 1; i<numbers.length; i++) {
			
			if(min > numbers[i]) {
				//true시에만 반응
				min = numbers[i];
				minPos = i+1;
			}
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}			
		}
		
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos +"번쨰 입니다.");
		
	}
	

}
