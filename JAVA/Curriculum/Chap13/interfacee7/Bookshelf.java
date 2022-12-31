package kr.co.ezenac.interfacee7;

import java.util.ArrayList;

public class Bookshelf {

	protected ArrayList<String> bookshelf; //protected : 상속관계에서는 접근 가능
	
	public Bookshelf() {
		bookshelf = new ArrayList<>();
		
	}
	public ArrayList<String> getBookshelf(){
		return bookshelf;
		
	}
	
	public int getCount() {
		return bookshelf.size();
		
	}
}
