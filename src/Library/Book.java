package Library;

class Book {
	private String name;
	private Branch branch;
	private int numDays;
	private boolean available;
	private Member member;
	private Date date;
	private int id;
	private static int a=0;
	
	public Book(String n,Branch b,int d) {
		name=n;
		branch=b;
		numDays=d;
		available=true;
		member=null;
		date=null;
		id=a;
		a++;
	}
	
	public String getName() {return name;}
	public void setAvailable() {available=true;}
	public void setUnvailable() {available=false;}
	public boolean isAvailable() {return available;}
	public int getNumDays() {return numDays;}
	public void setMember(Member m) {member=m;}
	public void setDate(Date d) {date=d;}

	@Override
	public String toString() {
		if(this.isAvailable())
			return id+"- "+name+" (Available)" ;
		else
			return id+"- "+name+" (Unvailable)" ;
	}

	public Date getDate() {
		return date;
	}
	
	
}
