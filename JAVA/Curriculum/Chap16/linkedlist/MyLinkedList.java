package kr.co.ezenac.linkedlist;

public class MyLinkedList {
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
		
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		
		if (head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;			
			while(temp.next != null)
				temp = temp.next;			//temp를 MyListNode로 생성했기 때문에 next 받아올 수 있음
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if (position <0 || position > count) { //유효성 검정
			System.out.println("추가할 위치 오류입니다. 현재 리스트의 개수는 " +count + "개 입니다." );
			return null;
		}
		if (position == 0){
			newNode.next = head;			   // 추가하고자 하는 위치가 맨 앞일 경우
			head = newNode;
		}
//	insertElement-------------------------------------------------------------------------
		else {
			MyListNode preNode = null;
			for (i=0; i <position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
// 			최종적으로 preNode는 p-1번째 값이 들어가고, 
//			tempNode에는 p번째 값을 가리키는 tempNode.next가 들어감
			newNode.next = preNode.next;
			preNode.next = newNode;
// newNode가 p번째 값을 카리키도록 newNode.next에 preNode.next(p번째 값을 가리킴)를 넣음
// preNode가 newNode를 가리키도록 preNode.next에 newNode의 주소값을 넣어줌
			//p번째 자리에 newNode가 오게 됨

		}
		count++;
		return newNode; 
	}
	
	public MyListNode removeElement(int position ) {
		int i;
		MyListNode tempNode = head;
		if (position >= count ) {
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " +count+"개 입니다.");
			return null;
		}
		if (position == 0) {
			head = tempNode.next;	//0번(head)이 삭제되어 head가 다음 주소의 노드가 할당됨
		}
		else {
			MyListNode preNode = null;
			for(i = 0; i < position ; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
// 최종적으로 preNode에 p-1번째 값,
// tempNode에는 p번째 값을 가리키는 tempNode.next가 들어감
			}
			preNode.next = tempNode.next;
//			p-1번째인 preNode에 p+1번째 값을 가리키는 tempNode.next를 넣음
//			==> 최종적으로 p번째 노드는 링크에서 빠지고 GarbageCollector가 삭제하게 됨
		}
		count--;
		System.out.println(position + "번째 항목이 삭제되었습니다.");
		
		return tempNode;
	}
	public void removeAll() {
		head = null;
		count = 0;
	}
	
	
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;		// 다음 링크를 temp에 계속 할당
			if (temp != null) {
				System.out.print("->");
			}
			// temp가 null이면: 0번째= 노드에 데이터 추가
			// temp가 null이 아니면: 링크 추가
		}
		System.out.println();
	}
	public int getSize() {
		return count;
	}
}
