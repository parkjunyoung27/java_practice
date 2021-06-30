package linkedList;

public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList()
	{
		head = null;
		count = 0;  
	}
	
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode;
		if(head == null){  //맨 처음일때
			newNode = new MyListNode(data);
			head = newNode;
		}
		else{
			newNode = new MyListNode(data);
			MyListNode temp = head; 
			while(temp.next != null)  //맨 뒤로 가서  
				temp = temp.next; // 다음 노드를 계속 타고들어감
			temp.next = newNode; //맨 마지막 노드
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data ) 
	{//중간에 들어가는 경우, previous노드를 찾아야됨 
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count ){ // 추가할 위치인가
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞으로 들어가는 경우
			newNode.next = head; //헤드가 다음번
			head = newNode;//새노드가 헤드로 변경
		}
		else{//previous노드 찾기
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
				
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head; // 맨 앞 
		
		if(position >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞을 삭제하는
			head = tempNode.next;
		}
		else{
			MyListNode preNode = null;	
			for(i=0; i<position; i++){ // position의 바로 앞 부분까지 찾기
				preNode = tempNode; //이전노드 = 현재노드
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}
