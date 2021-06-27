package Library;

import java.util.ArrayList;

class Library {
	private String name;
	private ArrayList<Branch> branches;
	private ArrayList<Member> members;
	
	public Library(String n) {
		name=n;
		branches=new ArrayList<>();
		members=new ArrayList<>();
	}
	
	public Branch openBranch(String n) {
		Branch branch=new Branch(n);
		branches.add(branch);
		return branch;
	}
	
	public void closeBranch(Branch b1, Branch b2) {
		for(int x=0;x<b1.getBooks().size();x++) {
			b2.getBooks().add(b1.getBooks().get(x));
		}
	}
	
	public void addMember(Member m) {
		members.add(m);
	}
	
	public void listBooks() {
		System.out.println("List of books at Library "+name);
		for(int x=0;x<branches.size();x++) {
			System.out.println("Books at "+branches.get(x).getName());
			for (int y=0;y<branches.get(x).getBooks().size();y++) {
				System.out.print(branches.get(x).getBooks().get(y).toString());
			}
		}
	}
}
