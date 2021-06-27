package Library;

import java.util.ArrayList;

class Member {
	private String fullName;
	private ArrayList<Book> booksBorrowed;
	private ArrayList<Book> booksReturned;
	
	public Member (String s) {
		fullName=s;
		booksBorrowed=new ArrayList<>();
		booksReturned=new ArrayList<>();
	}
	
	public void listBooks() {
		System.out.println("Currently borrowed books:");
		for(int x=0;x<booksBorrowed.size();x++) {
			System.out.println("- "+booksBorrowed.get(x).getName());
		}
		System.out.println("Returned books:");
		for(int x=0;x<booksReturned.size();x++) {
			System.out.println("- "+booksReturned.get(x).getName());
		}
	}
	
	public void borrowBook(Book b, Date d) {
		if(!b.isAvailable()) {
			System.out.println(b.getName()+" is not available. Another member has already borrowed.");
		}
		else {
			b.setMember(this);
			b.setDate(d);
			b.setUnvailable();
			booksBorrowed.add(b);
			System.out.println(b.getName()+" has been borrowed by "+fullName+". The book can be kept "+b.getNumDays()+" days.");
		}
	}
	
	public void returnBook(Book b, Date d) {
		b.setAvailable();
		if(b.getDate().daysBetween(d)<b.getNumDays()) {
			System.out.println(b.getName()+" is returned on time.");
		}
		else {
			System.out.println(b.getName()+" has been returned "+ (b.getDate().daysBetween(d)-b.getNumDays())+ " days late. The late fee of "+(b.getDate().daysBetween(d)-b.getNumDays())*10+" TL is charged to "+fullName+"'s account.");
			b.setDate(d);
			b.getBranch().addBalance((b.getDate().daysBetween(d)-b.getNumDays())*10);
		}
	}
	
}
