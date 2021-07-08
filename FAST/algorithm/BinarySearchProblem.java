package algorithm;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
		int[] numbers = {12, 25, 31, 48, 54, 66, 83, 95, 108};
		
		int target = 83; //찾는 수 
		int left = 0; //맨 왼쪽부터 인덱스
		int right = numbers.length -1; //맨 오른쪽부터 인덱스
		int mid = (left+right) / 2; // 중간 인덱스 
		
		int temp = numbers[mid]; //중간값 
		boolean find = false; // 발견시 
		int count = 1;
		
		while(left <= right) { //
			
			if(target == temp) { //중간값이 타겟일때, 값을 찾을 때 
				find = true;
				break;
			}
			else if(target < temp) { // 중간값이 타겟보다 클때 
				right = mid -1; //오른쪽값이 중간값 전 위치로
			}
			else { // 중간값이 타켓보다 작을 때 
				left = mid+1; 
			}
			//중요** 비교하는 부분이 점점 줄어든다.
			//다시 반복 
			mid = (left+right)/2;
			temp = numbers[mid];
			count = count+1;
		}
		
		if(find == true) {
			mid++;
			System.out.println("찾는 수는 " + mid + "번째 있습니다.");
			System.out.println(count+"번 만에 찾았습니다.");
		}
		else System.out.println("찾는 수가 없습니다.");
	}
}
