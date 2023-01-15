package kr.co.ezenac.linkedlist;

public class MyListNode {

	private String data;		//자료
	public MyListNode next;	//다음 노드를 가리키는 링크. 링크는 자기자신의 타입을 가리킴

	public MyListNode() {	 	//링크 X , 자료값 X
		data = null;
		next = null;
	}
	
	public MyListNode(String data) {	// 링크 X, 자료값1 추가
		this.data = data;
		this.next = null;
		
	}
	public MyListNode(String data, MyListNode link) {	//링크 O , 자료값2 추가
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}
