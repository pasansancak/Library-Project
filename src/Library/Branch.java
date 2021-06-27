package Library;

import java.util.ArrayList;

class Branch {
	private String name;
	private ArrayList<Book> books;
	private double balance;
	
	public Branch(String n) {
		name=n;
		books=new ArrayList<>();
		balance=0;
	}
	
	public ArrayList<Book> getBooks(){
		return books;
	}

	public String getName() {
		return name;
	}
	
}
